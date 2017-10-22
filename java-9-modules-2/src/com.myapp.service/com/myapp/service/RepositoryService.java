package com.myapp.service;

import java.util.Iterator;
import java.util.ServiceLoader;
import com.myapp.service.provider.RepositoryProvider;
import java.util.List;
import java.util.stream.StreamSupport;
import java.util.stream.Collectors;
import java.util.logging.Logger;
import java.util.Random;
import java.time.Instant;
import static java.lang.String.format;

public class RepositoryService {

    private final static Logger LOG = Logger.getLogger(RepositoryService.class.getName());
    private final static Random RANDOM = new Random(Instant.now().toEpochMilli());

    public static Repository getRepository() {
        final ServiceLoader<RepositoryProvider> sl = ServiceLoader.load(RepositoryProvider.class);
        final Iterable<RepositoryProvider> iterable = () -> sl.iterator();

        List<RepositoryProvider> repositoryProviders = StreamSupport.stream(iterable.spliterator(), false)
            .peek(provider -> LOG.info(format("Found an implementation for RepositoryProvider: %s", provider.getClass())))
            .collect(Collectors.toList());

        if (repositoryProviders.isEmpty()) {
            throw new RuntimeException("No repository found!");
        }

        LOG.info(String.format("Found %d total implementations. Picking one randomly...", repositoryProviders.size()));

        final RepositoryProvider provider = repositoryProviders.get(RANDOM.nextInt(repositoryProviders.size()));
        return provider.get();
    }

}

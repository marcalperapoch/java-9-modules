module com.myapp.inmemory {
    requires com.myapp.service;
    provides com.myapp.service.provider.RepositoryProvider with com.myapp.inmemory.InMemoryRepositoryProvider;
}
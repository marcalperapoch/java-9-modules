module com.myapp.provider {
    requires com.myapp.service;
    provides com.myapp.service.Repository with com.myapp.provider.InMemoryRepository;
}
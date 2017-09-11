module com.myapp.service {
    exports com.myapp.service;
    exports com.myapp.service.provider;
    uses com.myapp.service.Repository;
    uses com.myapp.service.provider.RepositoryProvider;
}
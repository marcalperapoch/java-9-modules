module com.myapp.fromfile {
    requires com.myapp.service;
    provides com.myapp.service.provider.RepositoryProvider with com.myapp.fromfile.FromFileRepositoryProvider;
}
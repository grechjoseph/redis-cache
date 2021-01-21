<h1>Spring Boot Caching using Redis</h1>
<ol>
    <li>Run included docker compose for <b>redis (Server)</b> and <b>redis-commander (UI)</b>.</li>
    <li>Dependency Import: spring-boot-starter-data-redis</li>
    <li>Property: server.port: <b>1111</b></li>    
    <li>Property: spring.cache.type: <b>redis</b></li>
    <li>Property: spring.redis.host: <b>localhost</b></li>
    <li>Property: spring.redis.port: <b>6379</b></li>
    <li>Configuration: <b>@EnableCaching</b></li>
    <li>@CachePut(value='A', key='B'): Execute some method, and store its return value in the cache 'A', with key 'B' (or update existing).</li>
    <li>@Cacheable(value='A', key='B': Execute some method ONCE, and store its return value in the cache 'A', with key'B'. The next time this method is called, cached value is returned automatically.</li>
    <li>@CacheEvict(value='A', key='B'): Execute method and delete cached value from cache 'A', having key 'B'.</li>
</ol>
dataSource {
    dialect = org.hibernate.dialect.MySQL5InnoDBDialect
    driverClassName = "com.mysql.jdbc.Driver"
    pooled = true
}

hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = false
    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory'
}
// environment specific settings
environments {
    // one of 'create', 'create-drop', 'update', 'validate', ''
    development {
        dataSource {
            dbCreate = "update" 
            url="jdbc:mysql://localhost:3306/informant_desenv?autoReconnect=true&maxReconnects=10"
            username = "root"
            password = ""
            properties { 
                maxActive = 50 
                maxIdle = 25 
                minIdle =1 
                initialSize = 1 
                minEvictableIdleTimeMillis = 60000 
                timeBetweenEvictionRunsMillis = 60000 
                numTestsPerEvictionRun = 3 
                maxWait = 10000
                testOnBorrow = true 
                testWhileIdle = true 
                testOnReturn = false 
                validationQuery = "SELECT 1" 
            } 
        }
    }
    homolog {
        dataSource {
            dbCreate = "update" 
            url="jdbc:mysql://ip_homolog:3306/informant_homolog?autoReconnect=true&maxReconnects=10"
            username = "root"
            password = ""
            properties { 
                maxActive = 50 
                maxIdle = 25 
                minIdle =1 
                initialSize = 1 
                minEvictableIdleTimeMillis = 60000 
                timeBetweenEvictionRunsMillis = 60000 
                numTestsPerEvictionRun = 3 
                maxWait = 10000
                testOnBorrow = true 
                testWhileIdle = true 
                testOnReturn = false 
                validationQuery = "SELECT 1" 
            } 
        }
    }
    test {
        dataSource {
            dbCreate = "update"
            driverClassName = "org.h2.Driver"
            username = "sa"
            password = ""
            url = "jdbc:h2:mem:testDb;MVCC=TRUE;LOCK_TIMEOUT=10000"
        }
    }
    production {
        dataSource {
            dbCreate = "update"
            url="jdbc:mysql://ip_producao:3306/informant_prod?autoReconnect=true&maxReconnects=10"
            username = "usuario"
            password = "XXX"
            properties { 
                maxActive = 50 
                maxIdle = 25 
                minIdle =1 
                initialSize = 1 
                minEvictableIdleTimeMillis = 60000 
                timeBetweenEvictionRunsMillis = 60000 
                numTestsPerEvictionRun = 3 
                maxWait = 10000
                testOnBorrow = true 
                testWhileIdle = true 
                testOnReturn = false 
                validationQuery = "SELECT 1" 
            } 
        }
    }
}
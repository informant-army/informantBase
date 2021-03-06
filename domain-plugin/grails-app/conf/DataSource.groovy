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
            url="jdbc:mysql://localhost:3306/informant_desenv"
            username = "root"
            password = ""
        }
    }
    homolog {
        dataSource {
            dbCreate = "update" 
            url="jdbc:mysql://homolog:3306/informant_homolog"
            username = "root"
            password = ""
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
            url="jdbc:mysql://prod:3306/informant_production"
            username = "root"
            password = ""
        }
    }
}
// Place your Spring DSL code here
import org.springframework.web.servlet.i18n.SessionLocaleResolver

// Place your Spring DSL code here
beans = {
    localeResolver(SessionLocaleResolver) {
        defaultLocale = new Locale("pt","BR")
        Locale.setDefault(defaultLocale)
    }
}
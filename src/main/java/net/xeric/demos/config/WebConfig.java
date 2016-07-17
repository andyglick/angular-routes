package net.xeric.demos.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

//@Configuration
//@EnableWebMvc
@ComponentScan(basePackages = "net.xeric.demos.controllers")
public class WebConfig extends WebMvcConfigurerAdapter {

	@SuppressWarnings("WeakerAccess")
  static Map<String, String> resourceHandlerToResourceLocation = new LinkedHashMap<>();

	static {
		resourceHandlerToResourceLocation.put("/webjars*", "classpath:/META-INF/resources/webjars/");
		resourceHandlerToResourceLocation.put("/images*","classpath:/static/images/");
		resourceHandlerToResourceLocation.put("/css*", "classpath:/static/css/");
		resourceHandlerToResourceLocation.put("/js*", "classpath:/static/js/");
		resourceHandlerToResourceLocation.put("/node_modules*", "classpath:/static/node_modules/");
		resourceHandlerToResourceLocation.put("/templates/**", "classpath:/templates/");
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {

		Set<String> keySet = resourceHandlerToResourceLocation.keySet();

    keySet.stream().filter(key -> !registry.hasMappingForPattern(key)).forEach(key -> {
      registry.addResourceHandler(key).addResourceLocations(resourceHandlerToResourceLocation.get(key));
    });
	}
}

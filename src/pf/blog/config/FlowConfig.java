package pf.blog.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(value = {"/WEB-INF/flow.xml"})
public class FlowConfig {

}

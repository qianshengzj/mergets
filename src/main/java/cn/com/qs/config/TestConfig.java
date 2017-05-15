package cn.com.qs.config;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

/**
 * Created by randy on 2017/5/12.
 */
@Configuration
public class TestConfig  {
    protected final Log logger = LogFactory.getLog(getClass());

    @PostConstruct
    public void init(){
        System.out.printf(logger.isDebugEnabled()+"");
    }

}

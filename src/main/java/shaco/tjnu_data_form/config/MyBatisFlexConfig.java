package shaco.tjnu_data_form.config;

import com.mybatisflex.core.audit.AuditManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBatisFlexConfig {
    private static final Logger logger = LoggerFactory.getLogger("mybatis-flex-sql");

    public MyBatisFlexConfig() {
        //开启审计功能
        AuditManager.setAuditEnable(true);
        //设置 SQL 审计收集器
        AuditManager.setMessageCollector(
                auditMessage -> logger.info(">>>>>>SQL：{};  {}ms", auditMessage.getFullSql().toLowerCase(), auditMessage.getElapsedTime())
        );
    }
}

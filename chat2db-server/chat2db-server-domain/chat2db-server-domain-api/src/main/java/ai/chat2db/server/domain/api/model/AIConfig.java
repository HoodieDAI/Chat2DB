
package ai.chat2db.server.domain.api.model;

import ai.chat2db.server.domain.api.enums.AiSqlSourceEnum;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 * @author jipengfei
 * @version : SystemConfigRequest.java
 */
@Data
public class AIConfig {

    /**
     * APIKEY
     */
    private String apiKey = "";

    /**
     * APIHOST
     */
    private String apiHost = "";

    /**
     * api http proxy host
     */
    private String httpProxyHost = "";

    /**
     * api http proxy port
     */
    private String httpProxyPort = "";

    /**
     * @see AiSqlSourceEnum
     */
    @NotNull
    private String aiSqlSource = "";

    /**
     * return data stream
     * 非必填，默认值为TRUE
     */
    private Boolean stream = Boolean.TRUE;

    /**
     * deployed model, default gpt-3.5-turbo
     */
    private String model = "";
}

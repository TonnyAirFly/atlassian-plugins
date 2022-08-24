package ScioSearchConfigRestPlugin.impl;

import ScioSearchConfigRestPlugin.api.MyPluginComponent;
import com.atlassian.sal.api.ApplicationProperties;

public class MyPluginComponentImpl implements MyPluginComponent {
  public static final String TARGET_CONFIG_KEY =
      "GleanSearchConfigRestPlugin.targetURL";
  private final ApplicationProperties applicationProperties;

  public MyPluginComponentImpl(final ApplicationProperties applicationProperties) {
    this.applicationProperties = applicationProperties;
  }

  public String getName() {
    if (null != applicationProperties) {
      return "myComponent:" + applicationProperties.getDisplayName();
    }

    return "myComponent";
  }
}

// Generated by Dagger (https://dagger.dev).
package com.newproject.user.data.model.local;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class UserSession_Factory implements Factory<UserSession> {
  @Override
  public UserSession get() {
    return newInstance();
  }

  public static UserSession_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static UserSession newInstance() {
    return new UserSession();
  }

  private static final class InstanceHolder {
    private static final UserSession_Factory INSTANCE = new UserSession_Factory();
  }
}

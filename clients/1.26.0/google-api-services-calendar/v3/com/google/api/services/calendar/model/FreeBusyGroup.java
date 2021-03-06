/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.calendar.model;

/**
 * Model definition for FreeBusyGroup.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Calendar API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FreeBusyGroup extends com.google.api.client.json.GenericJson {

  /**
   * List of calendars' identifiers within a group.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> calendars;

  /**
   * Optional error(s) (if computation for the group failed).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Error> errors;

  static {
    // hack to force ProGuard to consider Error used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Error.class);
  }

  /**
   * List of calendars' identifiers within a group.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getCalendars() {
    return calendars;
  }

  /**
   * List of calendars' identifiers within a group.
   * @param calendars calendars or {@code null} for none
   */
  public FreeBusyGroup setCalendars(java.util.List<java.lang.String> calendars) {
    this.calendars = calendars;
    return this;
  }

  /**
   * Optional error(s) (if computation for the group failed).
   * @return value or {@code null} for none
   */
  public java.util.List<Error> getErrors() {
    return errors;
  }

  /**
   * Optional error(s) (if computation for the group failed).
   * @param errors errors or {@code null} for none
   */
  public FreeBusyGroup setErrors(java.util.List<Error> errors) {
    this.errors = errors;
    return this;
  }

  @Override
  public FreeBusyGroup set(String fieldName, Object value) {
    return (FreeBusyGroup) super.set(fieldName, value);
  }

  @Override
  public FreeBusyGroup clone() {
    return (FreeBusyGroup) super.clone();
  }

}

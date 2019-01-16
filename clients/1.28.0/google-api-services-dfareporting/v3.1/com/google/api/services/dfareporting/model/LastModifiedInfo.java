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

package com.google.api.services.dfareporting.model;

/**
 * Modification timestamp.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the DCM/DFA Reporting And Trafficking API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LastModifiedInfo extends com.google.api.client.json.GenericJson {

  /**
   * Timestamp of the last change in milliseconds since epoch.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long time;

  /**
   * Timestamp of the last change in milliseconds since epoch.
   * @return value or {@code null} for none
   */
  public java.lang.Long getTime() {
    return time;
  }

  /**
   * Timestamp of the last change in milliseconds since epoch.
   * @param time time or {@code null} for none
   */
  public LastModifiedInfo setTime(java.lang.Long time) {
    this.time = time;
    return this;
  }

  @Override
  public LastModifiedInfo set(String fieldName, Object value) {
    return (LastModifiedInfo) super.set(fieldName, value);
  }

  @Override
  public LastModifiedInfo clone() {
    return (LastModifiedInfo) super.clone();
  }

}

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

package com.google.api.services.dlp.v2.model;

/**
 * Message defining a custom regular expression.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Data Loss Prevention (DLP) API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GooglePrivacyDlpV2Regex extends com.google.api.client.json.GenericJson {

  /**
   * Pattern defining the regular expression. Its syntax (https://github.com/google/re2/wiki/Syntax)
   * can be found under the google/re2 repository on GitHub.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pattern;

  /**
   * Pattern defining the regular expression. Its syntax (https://github.com/google/re2/wiki/Syntax)
   * can be found under the google/re2 repository on GitHub.
   * @return value or {@code null} for none
   */
  public java.lang.String getPattern() {
    return pattern;
  }

  /**
   * Pattern defining the regular expression. Its syntax (https://github.com/google/re2/wiki/Syntax)
   * can be found under the google/re2 repository on GitHub.
   * @param pattern pattern or {@code null} for none
   */
  public GooglePrivacyDlpV2Regex setPattern(java.lang.String pattern) {
    this.pattern = pattern;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2Regex set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2Regex) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2Regex clone() {
    return (GooglePrivacyDlpV2Regex) super.clone();
  }

}

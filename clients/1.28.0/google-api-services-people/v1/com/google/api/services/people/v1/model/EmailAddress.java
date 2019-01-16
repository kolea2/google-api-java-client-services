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

package com.google.api.services.people.v1.model;

/**
 * A person's email address.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the People API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class EmailAddress extends com.google.api.client.json.GenericJson {

  /**
   * The display name of the email.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * The read-only type of the email address translated and formatted in the viewer's account locale
   * or the `Accept-Language` HTTP header locale.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String formattedType;

  /**
   * Metadata about the email address.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FieldMetadata metadata;

  /**
   * The type of the email address. The type can be custom or one of these predefined values:
   *
   * * `home` * `work` * `other`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The email address.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String value;

  /**
   * The display name of the email.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * The display name of the email.
   * @param displayName displayName or {@code null} for none
   */
  public EmailAddress setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The read-only type of the email address translated and formatted in the viewer's account locale
   * or the `Accept-Language` HTTP header locale.
   * @return value or {@code null} for none
   */
  public java.lang.String getFormattedType() {
    return formattedType;
  }

  /**
   * The read-only type of the email address translated and formatted in the viewer's account locale
   * or the `Accept-Language` HTTP header locale.
   * @param formattedType formattedType or {@code null} for none
   */
  public EmailAddress setFormattedType(java.lang.String formattedType) {
    this.formattedType = formattedType;
    return this;
  }

  /**
   * Metadata about the email address.
   * @return value or {@code null} for none
   */
  public FieldMetadata getMetadata() {
    return metadata;
  }

  /**
   * Metadata about the email address.
   * @param metadata metadata or {@code null} for none
   */
  public EmailAddress setMetadata(FieldMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * The type of the email address. The type can be custom or one of these predefined values:
   *
   * * `home` * `work` * `other`
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of the email address. The type can be custom or one of these predefined values:
   *
   * * `home` * `work` * `other`
   * @param type type or {@code null} for none
   */
  public EmailAddress setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * The email address.
   * @return value or {@code null} for none
   */
  public java.lang.String getValue() {
    return value;
  }

  /**
   * The email address.
   * @param value value or {@code null} for none
   */
  public EmailAddress setValue(java.lang.String value) {
    this.value = value;
    return this;
  }

  @Override
  public EmailAddress set(String fieldName, Object value) {
    return (EmailAddress) super.set(fieldName, value);
  }

  @Override
  public EmailAddress clone() {
    return (EmailAddress) super.clone();
  }

}

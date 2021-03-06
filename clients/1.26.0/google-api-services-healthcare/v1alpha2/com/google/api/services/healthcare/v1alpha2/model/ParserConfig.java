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

package com.google.api.services.healthcare.v1alpha2.model;

/**
 * The configuration for the parser. It determines how the server parses the messages.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Healthcare API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ParserConfig extends com.google.api.client.json.GenericJson {

  /**
   * Determines whether messages with no header are allowed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean allowNullHeader;

  /**
   * Byte(s) to be used as the segment terminator. If this is unset, '\r' will be used as segment
   * terminator.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String segmentTerminator;

  /**
   * Determines whether messages with no header are allowed.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAllowNullHeader() {
    return allowNullHeader;
  }

  /**
   * Determines whether messages with no header are allowed.
   * @param allowNullHeader allowNullHeader or {@code null} for none
   */
  public ParserConfig setAllowNullHeader(java.lang.Boolean allowNullHeader) {
    this.allowNullHeader = allowNullHeader;
    return this;
  }

  /**
   * Byte(s) to be used as the segment terminator. If this is unset, '\r' will be used as segment
   * terminator.
   * @see #decodeSegmentTerminator()
   * @return value or {@code null} for none
   */
  public java.lang.String getSegmentTerminator() {
    return segmentTerminator;
  }

  /**
   * Byte(s) to be used as the segment terminator. If this is unset, '\r' will be used as segment
   * terminator.
   * @see #getSegmentTerminator()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeSegmentTerminator() {
    return com.google.api.client.util.Base64.decodeBase64(segmentTerminator);
  }

  /**
   * Byte(s) to be used as the segment terminator. If this is unset, '\r' will be used as segment
   * terminator.
   * @see #encodeSegmentTerminator()
   * @param segmentTerminator segmentTerminator or {@code null} for none
   */
  public ParserConfig setSegmentTerminator(java.lang.String segmentTerminator) {
    this.segmentTerminator = segmentTerminator;
    return this;
  }

  /**
   * Byte(s) to be used as the segment terminator. If this is unset, '\r' will be used as segment
   * terminator.
   * @see #setSegmentTerminator()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public ParserConfig encodeSegmentTerminator(byte[] segmentTerminator) {
    this.segmentTerminator = com.google.api.client.util.Base64.encodeBase64URLSafeString(segmentTerminator);
    return this;
  }

  @Override
  public ParserConfig set(String fieldName, Object value) {
    return (ParserConfig) super.set(fieldName, value);
  }

  @Override
  public ParserConfig clone() {
    return (ParserConfig) super.clone();
  }

}

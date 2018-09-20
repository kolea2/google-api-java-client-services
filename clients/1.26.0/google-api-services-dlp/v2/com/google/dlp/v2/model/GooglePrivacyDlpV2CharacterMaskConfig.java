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

package com.google.dlp.v2.model;

/**
 * Partially mask a string by replacing a given number of characters with a fixed character. Masking
 * can start from the beginning or end of the string. This can be used on data of any type (numbers,
 * longs, and so on) and when de-identifying structured data we'll attempt to preserve the original
 * data's type. (This allows you to take a long like 123 and modify it to a string like **3.
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
public final class GooglePrivacyDlpV2CharacterMaskConfig extends com.google.api.client.json.GenericJson {

  /**
   * When masking a string, items in this list will be skipped when replacing. For example, if your
   * string is 555-555-5555 and you ask us to skip `-` and mask 5 chars with * we would produce
   * ***-*55-5555.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GooglePrivacyDlpV2CharsToIgnore> charactersToIgnore;

  /**
   * Character to mask the sensitive valuesfor example, "*" for an alphabetic string such as name,
   * or "0" for a numeric string such as ZIP code or credit card number. String must have length 1.
   * If not supplied, we will default to "*" for strings, 0 for digits.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String maskingCharacter;

  /**
   * Number of characters to mask. If not set, all matching chars will be masked. Skipped characters
   * do not count towards this tally.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer numberToMask;

  /**
   * Mask characters in reverse order. For example, if `masking_character` is '0', number_to_mask is
   * 14, and `reverse_order` is false, then 1234-5678-9012-3456 -> 00000000000000-3456 If
   * `masking_character` is '*', `number_to_mask` is 3, and `reverse_order` is true, then 12345 ->
   * 12***
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean reverseOrder;

  /**
   * When masking a string, items in this list will be skipped when replacing. For example, if your
   * string is 555-555-5555 and you ask us to skip `-` and mask 5 chars with * we would produce
   * ***-*55-5555.
   * @return value or {@code null} for none
   */
  public java.util.List<GooglePrivacyDlpV2CharsToIgnore> getCharactersToIgnore() {
    return charactersToIgnore;
  }

  /**
   * When masking a string, items in this list will be skipped when replacing. For example, if your
   * string is 555-555-5555 and you ask us to skip `-` and mask 5 chars with * we would produce
   * ***-*55-5555.
   * @param charactersToIgnore charactersToIgnore or {@code null} for none
   */
  public GooglePrivacyDlpV2CharacterMaskConfig setCharactersToIgnore(java.util.List<GooglePrivacyDlpV2CharsToIgnore> charactersToIgnore) {
    this.charactersToIgnore = charactersToIgnore;
    return this;
  }

  /**
   * Character to mask the sensitive valuesfor example, "*" for an alphabetic string such as name,
   * or "0" for a numeric string such as ZIP code or credit card number. String must have length 1.
   * If not supplied, we will default to "*" for strings, 0 for digits.
   * @return value or {@code null} for none
   */
  public java.lang.String getMaskingCharacter() {
    return maskingCharacter;
  }

  /**
   * Character to mask the sensitive valuesfor example, "*" for an alphabetic string such as name,
   * or "0" for a numeric string such as ZIP code or credit card number. String must have length 1.
   * If not supplied, we will default to "*" for strings, 0 for digits.
   * @param maskingCharacter maskingCharacter or {@code null} for none
   */
  public GooglePrivacyDlpV2CharacterMaskConfig setMaskingCharacter(java.lang.String maskingCharacter) {
    this.maskingCharacter = maskingCharacter;
    return this;
  }

  /**
   * Number of characters to mask. If not set, all matching chars will be masked. Skipped characters
   * do not count towards this tally.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNumberToMask() {
    return numberToMask;
  }

  /**
   * Number of characters to mask. If not set, all matching chars will be masked. Skipped characters
   * do not count towards this tally.
   * @param numberToMask numberToMask or {@code null} for none
   */
  public GooglePrivacyDlpV2CharacterMaskConfig setNumberToMask(java.lang.Integer numberToMask) {
    this.numberToMask = numberToMask;
    return this;
  }

  /**
   * Mask characters in reverse order. For example, if `masking_character` is '0', number_to_mask is
   * 14, and `reverse_order` is false, then 1234-5678-9012-3456 -> 00000000000000-3456 If
   * `masking_character` is '*', `number_to_mask` is 3, and `reverse_order` is true, then 12345 ->
   * 12***
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getReverseOrder() {
    return reverseOrder;
  }

  /**
   * Mask characters in reverse order. For example, if `masking_character` is '0', number_to_mask is
   * 14, and `reverse_order` is false, then 1234-5678-9012-3456 -> 00000000000000-3456 If
   * `masking_character` is '*', `number_to_mask` is 3, and `reverse_order` is true, then 12345 ->
   * 12***
   * @param reverseOrder reverseOrder or {@code null} for none
   */
  public GooglePrivacyDlpV2CharacterMaskConfig setReverseOrder(java.lang.Boolean reverseOrder) {
    this.reverseOrder = reverseOrder;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2CharacterMaskConfig set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2CharacterMaskConfig) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2CharacterMaskConfig clone() {
    return (GooglePrivacyDlpV2CharacterMaskConfig) super.clone();
  }

}

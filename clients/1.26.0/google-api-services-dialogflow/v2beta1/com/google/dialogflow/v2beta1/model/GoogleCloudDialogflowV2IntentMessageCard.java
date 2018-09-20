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

package com.google.dialogflow.v2beta1.model;

/**
 * The card response message.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2IntentMessageCard extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The collection of card buttons.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDialogflowV2IntentMessageCardButton> buttons;

  /**
   * Optional. The public URI to an image file for the card.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String imageUri;

  /**
   * Optional. The subtitle of the card.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String subtitle;

  /**
   * Optional. The title of the card.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * Optional. The collection of card buttons.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDialogflowV2IntentMessageCardButton> getButtons() {
    return buttons;
  }

  /**
   * Optional. The collection of card buttons.
   * @param buttons buttons or {@code null} for none
   */
  public GoogleCloudDialogflowV2IntentMessageCard setButtons(java.util.List<GoogleCloudDialogflowV2IntentMessageCardButton> buttons) {
    this.buttons = buttons;
    return this;
  }

  /**
   * Optional. The public URI to an image file for the card.
   * @return value or {@code null} for none
   */
  public java.lang.String getImageUri() {
    return imageUri;
  }

  /**
   * Optional. The public URI to an image file for the card.
   * @param imageUri imageUri or {@code null} for none
   */
  public GoogleCloudDialogflowV2IntentMessageCard setImageUri(java.lang.String imageUri) {
    this.imageUri = imageUri;
    return this;
  }

  /**
   * Optional. The subtitle of the card.
   * @return value or {@code null} for none
   */
  public java.lang.String getSubtitle() {
    return subtitle;
  }

  /**
   * Optional. The subtitle of the card.
   * @param subtitle subtitle or {@code null} for none
   */
  public GoogleCloudDialogflowV2IntentMessageCard setSubtitle(java.lang.String subtitle) {
    this.subtitle = subtitle;
    return this;
  }

  /**
   * Optional. The title of the card.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * Optional. The title of the card.
   * @param title title or {@code null} for none
   */
  public GoogleCloudDialogflowV2IntentMessageCard setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2IntentMessageCard set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2IntentMessageCard) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2IntentMessageCard clone() {
    return (GoogleCloudDialogflowV2IntentMessageCard) super.clone();
  }

}

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

package com.google.api.services.youtube.model;

/**
 * A channel banner returned as the response to a channel_banner.insert call.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the YouTube Data API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ChannelBannerResource extends com.google.api.client.json.GenericJson {

  /**
   * Etag of this resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "youtube#channelBannerResource".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The URL of this banner image.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String url;

  /**
   * Etag of this resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * Etag of this resource.
   * @param etag etag or {@code null} for none
   */
  public ChannelBannerResource setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "youtube#channelBannerResource".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "youtube#channelBannerResource".
   * @param kind kind or {@code null} for none
   */
  public ChannelBannerResource setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The URL of this banner image.
   * @return value or {@code null} for none
   */
  public java.lang.String getUrl() {
    return url;
  }

  /**
   * The URL of this banner image.
   * @param url url or {@code null} for none
   */
  public ChannelBannerResource setUrl(java.lang.String url) {
    this.url = url;
    return this;
  }

  @Override
  public ChannelBannerResource set(String fieldName, Object value) {
    return (ChannelBannerResource) super.set(fieldName, value);
  }

  @Override
  public ChannelBannerResource clone() {
    return (ChannelBannerResource) super.clone();
  }

}

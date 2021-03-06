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

package com.google.api.services.content.model;

/**
 * Model definition for TestOrderLineItemProduct.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Content API for Shopping. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TestOrderLineItemProduct extends com.google.api.client.json.GenericJson {

  /**
   * Brand of the item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String brand;

  /**
   * Condition or state of the item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String condition;

  /**
   * The two-letter ISO 639-1 language code for the item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String contentLanguage;

  /**
   * Global Trade Item Number (GTIN) of the item. Optional.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String gtin;

  /**
   * URL of an image of the item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String imageLink;

  /**
   * Shared identifier for all variants of the same product. Optional.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String itemGroupId;

  /**
   * Manufacturer Part Number (MPN) of the item. Optional.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mpn;

  /**
   * An identifier of the item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String offerId;

  /**
   * The price for the product. Tax is automatically calculated for MFL orders. For non-MFL orders,
   * tax settings from Merchant Center are applied.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Price price;

  /**
   * The CLDR territory code of the target country of the product.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String targetCountry;

  /**
   * The title of the product.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * Variant attributes for the item. Optional.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<OrderLineItemProductVariantAttribute> variantAttributes;

  static {
    // hack to force ProGuard to consider OrderLineItemProductVariantAttribute used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(OrderLineItemProductVariantAttribute.class);
  }

  /**
   * Brand of the item.
   * @return value or {@code null} for none
   */
  public java.lang.String getBrand() {
    return brand;
  }

  /**
   * Brand of the item.
   * @param brand brand or {@code null} for none
   */
  public TestOrderLineItemProduct setBrand(java.lang.String brand) {
    this.brand = brand;
    return this;
  }

  /**
   * Condition or state of the item.
   * @return value or {@code null} for none
   */
  public java.lang.String getCondition() {
    return condition;
  }

  /**
   * Condition or state of the item.
   * @param condition condition or {@code null} for none
   */
  public TestOrderLineItemProduct setCondition(java.lang.String condition) {
    this.condition = condition;
    return this;
  }

  /**
   * The two-letter ISO 639-1 language code for the item.
   * @return value or {@code null} for none
   */
  public java.lang.String getContentLanguage() {
    return contentLanguage;
  }

  /**
   * The two-letter ISO 639-1 language code for the item.
   * @param contentLanguage contentLanguage or {@code null} for none
   */
  public TestOrderLineItemProduct setContentLanguage(java.lang.String contentLanguage) {
    this.contentLanguage = contentLanguage;
    return this;
  }

  /**
   * Global Trade Item Number (GTIN) of the item. Optional.
   * @return value or {@code null} for none
   */
  public java.lang.String getGtin() {
    return gtin;
  }

  /**
   * Global Trade Item Number (GTIN) of the item. Optional.
   * @param gtin gtin or {@code null} for none
   */
  public TestOrderLineItemProduct setGtin(java.lang.String gtin) {
    this.gtin = gtin;
    return this;
  }

  /**
   * URL of an image of the item.
   * @return value or {@code null} for none
   */
  public java.lang.String getImageLink() {
    return imageLink;
  }

  /**
   * URL of an image of the item.
   * @param imageLink imageLink or {@code null} for none
   */
  public TestOrderLineItemProduct setImageLink(java.lang.String imageLink) {
    this.imageLink = imageLink;
    return this;
  }

  /**
   * Shared identifier for all variants of the same product. Optional.
   * @return value or {@code null} for none
   */
  public java.lang.String getItemGroupId() {
    return itemGroupId;
  }

  /**
   * Shared identifier for all variants of the same product. Optional.
   * @param itemGroupId itemGroupId or {@code null} for none
   */
  public TestOrderLineItemProduct setItemGroupId(java.lang.String itemGroupId) {
    this.itemGroupId = itemGroupId;
    return this;
  }

  /**
   * Manufacturer Part Number (MPN) of the item. Optional.
   * @return value or {@code null} for none
   */
  public java.lang.String getMpn() {
    return mpn;
  }

  /**
   * Manufacturer Part Number (MPN) of the item. Optional.
   * @param mpn mpn or {@code null} for none
   */
  public TestOrderLineItemProduct setMpn(java.lang.String mpn) {
    this.mpn = mpn;
    return this;
  }

  /**
   * An identifier of the item.
   * @return value or {@code null} for none
   */
  public java.lang.String getOfferId() {
    return offerId;
  }

  /**
   * An identifier of the item.
   * @param offerId offerId or {@code null} for none
   */
  public TestOrderLineItemProduct setOfferId(java.lang.String offerId) {
    this.offerId = offerId;
    return this;
  }

  /**
   * The price for the product. Tax is automatically calculated for MFL orders. For non-MFL orders,
   * tax settings from Merchant Center are applied.
   * @return value or {@code null} for none
   */
  public Price getPrice() {
    return price;
  }

  /**
   * The price for the product. Tax is automatically calculated for MFL orders. For non-MFL orders,
   * tax settings from Merchant Center are applied.
   * @param price price or {@code null} for none
   */
  public TestOrderLineItemProduct setPrice(Price price) {
    this.price = price;
    return this;
  }

  /**
   * The CLDR territory code of the target country of the product.
   * @return value or {@code null} for none
   */
  public java.lang.String getTargetCountry() {
    return targetCountry;
  }

  /**
   * The CLDR territory code of the target country of the product.
   * @param targetCountry targetCountry or {@code null} for none
   */
  public TestOrderLineItemProduct setTargetCountry(java.lang.String targetCountry) {
    this.targetCountry = targetCountry;
    return this;
  }

  /**
   * The title of the product.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * The title of the product.
   * @param title title or {@code null} for none
   */
  public TestOrderLineItemProduct setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  /**
   * Variant attributes for the item. Optional.
   * @return value or {@code null} for none
   */
  public java.util.List<OrderLineItemProductVariantAttribute> getVariantAttributes() {
    return variantAttributes;
  }

  /**
   * Variant attributes for the item. Optional.
   * @param variantAttributes variantAttributes or {@code null} for none
   */
  public TestOrderLineItemProduct setVariantAttributes(java.util.List<OrderLineItemProductVariantAttribute> variantAttributes) {
    this.variantAttributes = variantAttributes;
    return this;
  }

  @Override
  public TestOrderLineItemProduct set(String fieldName, Object value) {
    return (TestOrderLineItemProduct) super.set(fieldName, value);
  }

  @Override
  public TestOrderLineItemProduct clone() {
    return (TestOrderLineItemProduct) super.clone();
  }

}

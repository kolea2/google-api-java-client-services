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

package com.google.api.services.youtubereporting.model;

/**
 * gdata
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the YouTube Reporting API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GdataMedia extends com.google.api.client.json.GenericJson {

  /**
   * gdata
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String algorithm;

  /**
   * gdata
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String bigstoreObjectRef;

  /**
   * gdata
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String blobRef;

  /**
   * gdata
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GdataBlobstore2Info blobstore2Info;

  /**
   * gdata
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GdataCompositeMedia> compositeMedia;

  static {
    // hack to force ProGuard to consider GdataCompositeMedia used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GdataCompositeMedia.class);
  }

  /**
   * gdata
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String contentType;

  /**
   * gdata
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GdataContentTypeInfo contentTypeInfo;

  /**
   * gdata
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cosmoBinaryReference;

  /**
   * gdata
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long crc32cHash;

  /**
   * gdata
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GdataDiffChecksumsResponse diffChecksumsResponse;

  /**
   * gdata
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GdataDiffDownloadResponse diffDownloadResponse;

  /**
   * gdata
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GdataDiffUploadRequest diffUploadRequest;

  /**
   * gdata
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GdataDiffUploadResponse diffUploadResponse;

  /**
   * gdata
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GdataDiffVersionResponse diffVersionResponse;

  /**
   * gdata
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GdataDownloadParameters downloadParameters;

  /**
   * gdata
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String filename;

  /**
   * gdata
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String hash;

  /**
   * gdata
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean hashVerified;

  /**
   * gdata
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String inline;

  /**
   * gdata
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isPotentialRetry;

  /**
   * gdata
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long length;

  /**
   * gdata
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String md5Hash;

  /**
   * gdata
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mediaId;

  /**
   * gdata
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GdataObjectId objectId;

  /**
   * gdata
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String path;

  /**
   * gdata
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String referenceType;

  /**
   * gdata
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sha1Hash;

  /**
   * gdata
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sha256Hash;

  /**
   * gdata
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger timestamp;

  /**
   * gdata
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String token;

  /**
   * gdata
   * @return value or {@code null} for none
   */
  public java.lang.String getAlgorithm() {
    return algorithm;
  }

  /**
   * gdata
   * @param algorithm algorithm or {@code null} for none
   */
  public GdataMedia setAlgorithm(java.lang.String algorithm) {
    this.algorithm = algorithm;
    return this;
  }

  /**
   * gdata
   * @see #decodeBigstoreObjectRef()
   * @return value or {@code null} for none
   */
  public java.lang.String getBigstoreObjectRef() {
    return bigstoreObjectRef;
  }

  /**
   * gdata
   * @see #getBigstoreObjectRef()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeBigstoreObjectRef() {
    return com.google.api.client.util.Base64.decodeBase64(bigstoreObjectRef);
  }

  /**
   * gdata
   * @see #encodeBigstoreObjectRef()
   * @param bigstoreObjectRef bigstoreObjectRef or {@code null} for none
   */
  public GdataMedia setBigstoreObjectRef(java.lang.String bigstoreObjectRef) {
    this.bigstoreObjectRef = bigstoreObjectRef;
    return this;
  }

  /**
   * gdata
   * @see #setBigstoreObjectRef()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public GdataMedia encodeBigstoreObjectRef(byte[] bigstoreObjectRef) {
    this.bigstoreObjectRef = com.google.api.client.util.Base64.encodeBase64URLSafeString(bigstoreObjectRef);
    return this;
  }

  /**
   * gdata
   * @see #decodeBlobRef()
   * @return value or {@code null} for none
   */
  public java.lang.String getBlobRef() {
    return blobRef;
  }

  /**
   * gdata
   * @see #getBlobRef()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeBlobRef() {
    return com.google.api.client.util.Base64.decodeBase64(blobRef);
  }

  /**
   * gdata
   * @see #encodeBlobRef()
   * @param blobRef blobRef or {@code null} for none
   */
  public GdataMedia setBlobRef(java.lang.String blobRef) {
    this.blobRef = blobRef;
    return this;
  }

  /**
   * gdata
   * @see #setBlobRef()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public GdataMedia encodeBlobRef(byte[] blobRef) {
    this.blobRef = com.google.api.client.util.Base64.encodeBase64URLSafeString(blobRef);
    return this;
  }

  /**
   * gdata
   * @return value or {@code null} for none
   */
  public GdataBlobstore2Info getBlobstore2Info() {
    return blobstore2Info;
  }

  /**
   * gdata
   * @param blobstore2Info blobstore2Info or {@code null} for none
   */
  public GdataMedia setBlobstore2Info(GdataBlobstore2Info blobstore2Info) {
    this.blobstore2Info = blobstore2Info;
    return this;
  }

  /**
   * gdata
   * @return value or {@code null} for none
   */
  public java.util.List<GdataCompositeMedia> getCompositeMedia() {
    return compositeMedia;
  }

  /**
   * gdata
   * @param compositeMedia compositeMedia or {@code null} for none
   */
  public GdataMedia setCompositeMedia(java.util.List<GdataCompositeMedia> compositeMedia) {
    this.compositeMedia = compositeMedia;
    return this;
  }

  /**
   * gdata
   * @return value or {@code null} for none
   */
  public java.lang.String getContentType() {
    return contentType;
  }

  /**
   * gdata
   * @param contentType contentType or {@code null} for none
   */
  public GdataMedia setContentType(java.lang.String contentType) {
    this.contentType = contentType;
    return this;
  }

  /**
   * gdata
   * @return value or {@code null} for none
   */
  public GdataContentTypeInfo getContentTypeInfo() {
    return contentTypeInfo;
  }

  /**
   * gdata
   * @param contentTypeInfo contentTypeInfo or {@code null} for none
   */
  public GdataMedia setContentTypeInfo(GdataContentTypeInfo contentTypeInfo) {
    this.contentTypeInfo = contentTypeInfo;
    return this;
  }

  /**
   * gdata
   * @see #decodeCosmoBinaryReference()
   * @return value or {@code null} for none
   */
  public java.lang.String getCosmoBinaryReference() {
    return cosmoBinaryReference;
  }

  /**
   * gdata
   * @see #getCosmoBinaryReference()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeCosmoBinaryReference() {
    return com.google.api.client.util.Base64.decodeBase64(cosmoBinaryReference);
  }

  /**
   * gdata
   * @see #encodeCosmoBinaryReference()
   * @param cosmoBinaryReference cosmoBinaryReference or {@code null} for none
   */
  public GdataMedia setCosmoBinaryReference(java.lang.String cosmoBinaryReference) {
    this.cosmoBinaryReference = cosmoBinaryReference;
    return this;
  }

  /**
   * gdata
   * @see #setCosmoBinaryReference()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public GdataMedia encodeCosmoBinaryReference(byte[] cosmoBinaryReference) {
    this.cosmoBinaryReference = com.google.api.client.util.Base64.encodeBase64URLSafeString(cosmoBinaryReference);
    return this;
  }

  /**
   * gdata
   * @return value or {@code null} for none
   */
  public java.lang.Long getCrc32cHash() {
    return crc32cHash;
  }

  /**
   * gdata
   * @param crc32cHash crc32cHash or {@code null} for none
   */
  public GdataMedia setCrc32cHash(java.lang.Long crc32cHash) {
    this.crc32cHash = crc32cHash;
    return this;
  }

  /**
   * gdata
   * @return value or {@code null} for none
   */
  public GdataDiffChecksumsResponse getDiffChecksumsResponse() {
    return diffChecksumsResponse;
  }

  /**
   * gdata
   * @param diffChecksumsResponse diffChecksumsResponse or {@code null} for none
   */
  public GdataMedia setDiffChecksumsResponse(GdataDiffChecksumsResponse diffChecksumsResponse) {
    this.diffChecksumsResponse = diffChecksumsResponse;
    return this;
  }

  /**
   * gdata
   * @return value or {@code null} for none
   */
  public GdataDiffDownloadResponse getDiffDownloadResponse() {
    return diffDownloadResponse;
  }

  /**
   * gdata
   * @param diffDownloadResponse diffDownloadResponse or {@code null} for none
   */
  public GdataMedia setDiffDownloadResponse(GdataDiffDownloadResponse diffDownloadResponse) {
    this.diffDownloadResponse = diffDownloadResponse;
    return this;
  }

  /**
   * gdata
   * @return value or {@code null} for none
   */
  public GdataDiffUploadRequest getDiffUploadRequest() {
    return diffUploadRequest;
  }

  /**
   * gdata
   * @param diffUploadRequest diffUploadRequest or {@code null} for none
   */
  public GdataMedia setDiffUploadRequest(GdataDiffUploadRequest diffUploadRequest) {
    this.diffUploadRequest = diffUploadRequest;
    return this;
  }

  /**
   * gdata
   * @return value or {@code null} for none
   */
  public GdataDiffUploadResponse getDiffUploadResponse() {
    return diffUploadResponse;
  }

  /**
   * gdata
   * @param diffUploadResponse diffUploadResponse or {@code null} for none
   */
  public GdataMedia setDiffUploadResponse(GdataDiffUploadResponse diffUploadResponse) {
    this.diffUploadResponse = diffUploadResponse;
    return this;
  }

  /**
   * gdata
   * @return value or {@code null} for none
   */
  public GdataDiffVersionResponse getDiffVersionResponse() {
    return diffVersionResponse;
  }

  /**
   * gdata
   * @param diffVersionResponse diffVersionResponse or {@code null} for none
   */
  public GdataMedia setDiffVersionResponse(GdataDiffVersionResponse diffVersionResponse) {
    this.diffVersionResponse = diffVersionResponse;
    return this;
  }

  /**
   * gdata
   * @return value or {@code null} for none
   */
  public GdataDownloadParameters getDownloadParameters() {
    return downloadParameters;
  }

  /**
   * gdata
   * @param downloadParameters downloadParameters or {@code null} for none
   */
  public GdataMedia setDownloadParameters(GdataDownloadParameters downloadParameters) {
    this.downloadParameters = downloadParameters;
    return this;
  }

  /**
   * gdata
   * @return value or {@code null} for none
   */
  public java.lang.String getFilename() {
    return filename;
  }

  /**
   * gdata
   * @param filename filename or {@code null} for none
   */
  public GdataMedia setFilename(java.lang.String filename) {
    this.filename = filename;
    return this;
  }

  /**
   * gdata
   * @return value or {@code null} for none
   */
  public java.lang.String getHash() {
    return hash;
  }

  /**
   * gdata
   * @param hash hash or {@code null} for none
   */
  public GdataMedia setHash(java.lang.String hash) {
    this.hash = hash;
    return this;
  }

  /**
   * gdata
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getHashVerified() {
    return hashVerified;
  }

  /**
   * gdata
   * @param hashVerified hashVerified or {@code null} for none
   */
  public GdataMedia setHashVerified(java.lang.Boolean hashVerified) {
    this.hashVerified = hashVerified;
    return this;
  }

  /**
   * gdata
   * @see #decodeInline()
   * @return value or {@code null} for none
   */
  public java.lang.String getInline() {
    return inline;
  }

  /**
   * gdata
   * @see #getInline()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeInline() {
    return com.google.api.client.util.Base64.decodeBase64(inline);
  }

  /**
   * gdata
   * @see #encodeInline()
   * @param inline inline or {@code null} for none
   */
  public GdataMedia setInline(java.lang.String inline) {
    this.inline = inline;
    return this;
  }

  /**
   * gdata
   * @see #setInline()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public GdataMedia encodeInline(byte[] inline) {
    this.inline = com.google.api.client.util.Base64.encodeBase64URLSafeString(inline);
    return this;
  }

  /**
   * gdata
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsPotentialRetry() {
    return isPotentialRetry;
  }

  /**
   * gdata
   * @param isPotentialRetry isPotentialRetry or {@code null} for none
   */
  public GdataMedia setIsPotentialRetry(java.lang.Boolean isPotentialRetry) {
    this.isPotentialRetry = isPotentialRetry;
    return this;
  }

  /**
   * gdata
   * @return value or {@code null} for none
   */
  public java.lang.Long getLength() {
    return length;
  }

  /**
   * gdata
   * @param length length or {@code null} for none
   */
  public GdataMedia setLength(java.lang.Long length) {
    this.length = length;
    return this;
  }

  /**
   * gdata
   * @see #decodeMd5Hash()
   * @return value or {@code null} for none
   */
  public java.lang.String getMd5Hash() {
    return md5Hash;
  }

  /**
   * gdata
   * @see #getMd5Hash()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeMd5Hash() {
    return com.google.api.client.util.Base64.decodeBase64(md5Hash);
  }

  /**
   * gdata
   * @see #encodeMd5Hash()
   * @param md5Hash md5Hash or {@code null} for none
   */
  public GdataMedia setMd5Hash(java.lang.String md5Hash) {
    this.md5Hash = md5Hash;
    return this;
  }

  /**
   * gdata
   * @see #setMd5Hash()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public GdataMedia encodeMd5Hash(byte[] md5Hash) {
    this.md5Hash = com.google.api.client.util.Base64.encodeBase64URLSafeString(md5Hash);
    return this;
  }

  /**
   * gdata
   * @see #decodeMediaId()
   * @return value or {@code null} for none
   */
  public java.lang.String getMediaId() {
    return mediaId;
  }

  /**
   * gdata
   * @see #getMediaId()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeMediaId() {
    return com.google.api.client.util.Base64.decodeBase64(mediaId);
  }

  /**
   * gdata
   * @see #encodeMediaId()
   * @param mediaId mediaId or {@code null} for none
   */
  public GdataMedia setMediaId(java.lang.String mediaId) {
    this.mediaId = mediaId;
    return this;
  }

  /**
   * gdata
   * @see #setMediaId()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public GdataMedia encodeMediaId(byte[] mediaId) {
    this.mediaId = com.google.api.client.util.Base64.encodeBase64URLSafeString(mediaId);
    return this;
  }

  /**
   * gdata
   * @return value or {@code null} for none
   */
  public GdataObjectId getObjectId() {
    return objectId;
  }

  /**
   * gdata
   * @param objectId objectId or {@code null} for none
   */
  public GdataMedia setObjectId(GdataObjectId objectId) {
    this.objectId = objectId;
    return this;
  }

  /**
   * gdata
   * @return value or {@code null} for none
   */
  public java.lang.String getPath() {
    return path;
  }

  /**
   * gdata
   * @param path path or {@code null} for none
   */
  public GdataMedia setPath(java.lang.String path) {
    this.path = path;
    return this;
  }

  /**
   * gdata
   * @return value or {@code null} for none
   */
  public java.lang.String getReferenceType() {
    return referenceType;
  }

  /**
   * gdata
   * @param referenceType referenceType or {@code null} for none
   */
  public GdataMedia setReferenceType(java.lang.String referenceType) {
    this.referenceType = referenceType;
    return this;
  }

  /**
   * gdata
   * @see #decodeSha1Hash()
   * @return value or {@code null} for none
   */
  public java.lang.String getSha1Hash() {
    return sha1Hash;
  }

  /**
   * gdata
   * @see #getSha1Hash()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeSha1Hash() {
    return com.google.api.client.util.Base64.decodeBase64(sha1Hash);
  }

  /**
   * gdata
   * @see #encodeSha1Hash()
   * @param sha1Hash sha1Hash or {@code null} for none
   */
  public GdataMedia setSha1Hash(java.lang.String sha1Hash) {
    this.sha1Hash = sha1Hash;
    return this;
  }

  /**
   * gdata
   * @see #setSha1Hash()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public GdataMedia encodeSha1Hash(byte[] sha1Hash) {
    this.sha1Hash = com.google.api.client.util.Base64.encodeBase64URLSafeString(sha1Hash);
    return this;
  }

  /**
   * gdata
   * @see #decodeSha256Hash()
   * @return value or {@code null} for none
   */
  public java.lang.String getSha256Hash() {
    return sha256Hash;
  }

  /**
   * gdata
   * @see #getSha256Hash()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeSha256Hash() {
    return com.google.api.client.util.Base64.decodeBase64(sha256Hash);
  }

  /**
   * gdata
   * @see #encodeSha256Hash()
   * @param sha256Hash sha256Hash or {@code null} for none
   */
  public GdataMedia setSha256Hash(java.lang.String sha256Hash) {
    this.sha256Hash = sha256Hash;
    return this;
  }

  /**
   * gdata
   * @see #setSha256Hash()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public GdataMedia encodeSha256Hash(byte[] sha256Hash) {
    this.sha256Hash = com.google.api.client.util.Base64.encodeBase64URLSafeString(sha256Hash);
    return this;
  }

  /**
   * gdata
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getTimestamp() {
    return timestamp;
  }

  /**
   * gdata
   * @param timestamp timestamp or {@code null} for none
   */
  public GdataMedia setTimestamp(java.math.BigInteger timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * gdata
   * @return value or {@code null} for none
   */
  public java.lang.String getToken() {
    return token;
  }

  /**
   * gdata
   * @param token token or {@code null} for none
   */
  public GdataMedia setToken(java.lang.String token) {
    this.token = token;
    return this;
  }

  @Override
  public GdataMedia set(String fieldName, Object value) {
    return (GdataMedia) super.set(fieldName, value);
  }

  @Override
  public GdataMedia clone() {
    return (GdataMedia) super.clone();
  }

}

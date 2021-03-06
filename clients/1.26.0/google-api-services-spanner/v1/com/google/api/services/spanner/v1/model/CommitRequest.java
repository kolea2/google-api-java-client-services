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

package com.google.api.services.spanner.v1.model;

/**
 * The request for Commit.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Spanner API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CommitRequest extends com.google.api.client.json.GenericJson {

  /**
   * The mutations to be executed when this transaction commits. All mutations are applied
   * atomically, in the order they appear in this list.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Mutation> mutations;

  /**
   * Execute mutations in a temporary transaction. Note that unlike commit of a previously-started
   * transaction, commit with a temporary transaction is non-idempotent. That is, if the
   * `CommitRequest` is sent to Cloud Spanner more than once (for instance, due to retries in the
   * application, or in the transport library), it is possible that the mutations are executed more
   * than once. If this is undesirable, use BeginTransaction and Commit instead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TransactionOptions singleUseTransaction;

  /**
   * Commit a previously-started transaction.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String transactionId;

  /**
   * The mutations to be executed when this transaction commits. All mutations are applied
   * atomically, in the order they appear in this list.
   * @return value or {@code null} for none
   */
  public java.util.List<Mutation> getMutations() {
    return mutations;
  }

  /**
   * The mutations to be executed when this transaction commits. All mutations are applied
   * atomically, in the order they appear in this list.
   * @param mutations mutations or {@code null} for none
   */
  public CommitRequest setMutations(java.util.List<Mutation> mutations) {
    this.mutations = mutations;
    return this;
  }

  /**
   * Execute mutations in a temporary transaction. Note that unlike commit of a previously-started
   * transaction, commit with a temporary transaction is non-idempotent. That is, if the
   * `CommitRequest` is sent to Cloud Spanner more than once (for instance, due to retries in the
   * application, or in the transport library), it is possible that the mutations are executed more
   * than once. If this is undesirable, use BeginTransaction and Commit instead.
   * @return value or {@code null} for none
   */
  public TransactionOptions getSingleUseTransaction() {
    return singleUseTransaction;
  }

  /**
   * Execute mutations in a temporary transaction. Note that unlike commit of a previously-started
   * transaction, commit with a temporary transaction is non-idempotent. That is, if the
   * `CommitRequest` is sent to Cloud Spanner more than once (for instance, due to retries in the
   * application, or in the transport library), it is possible that the mutations are executed more
   * than once. If this is undesirable, use BeginTransaction and Commit instead.
   * @param singleUseTransaction singleUseTransaction or {@code null} for none
   */
  public CommitRequest setSingleUseTransaction(TransactionOptions singleUseTransaction) {
    this.singleUseTransaction = singleUseTransaction;
    return this;
  }

  /**
   * Commit a previously-started transaction.
   * @see #decodeTransactionId()
   * @return value or {@code null} for none
   */
  public java.lang.String getTransactionId() {
    return transactionId;
  }

  /**
   * Commit a previously-started transaction.
   * @see #getTransactionId()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeTransactionId() {
    return com.google.api.client.util.Base64.decodeBase64(transactionId);
  }

  /**
   * Commit a previously-started transaction.
   * @see #encodeTransactionId()
   * @param transactionId transactionId or {@code null} for none
   */
  public CommitRequest setTransactionId(java.lang.String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

  /**
   * Commit a previously-started transaction.
   * @see #setTransactionId()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public CommitRequest encodeTransactionId(byte[] transactionId) {
    this.transactionId = com.google.api.client.util.Base64.encodeBase64URLSafeString(transactionId);
    return this;
  }

  @Override
  public CommitRequest set(String fieldName, Object value) {
    return (CommitRequest) super.set(fieldName, value);
  }

  @Override
  public CommitRequest clone() {
    return (CommitRequest) super.clone();
  }

}

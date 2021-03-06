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

package com.google.api.services.iap.v1.model;

/**
 * Associates `members` with a `role`.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Identity-Aware Proxy API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Binding extends com.google.api.client.json.GenericJson {

  /**
   * Unimplemented. The condition that is associated with this binding. NOTE: an unsatisfied
   * condition will not allow user access via current binding. Different bindings, including their
   * conditions, are examined independently.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Expr condition;

  /**
   * Specifies the identities requesting access for a Cloud Platform resource. `members` can have
   * the following values:
   *
   * * `allUsers`: A special identifier that represents anyone who is    on the internet; with or
   * without a Google account.
   *
   * * `allAuthenticatedUsers`: A special identifier that represents anyone    who is authenticated
   * with a Google account or a service account.
   *
   * * `user:{emailid}`: An email address that represents a specific Google    account. For example,
   * `alice@gmail.com` .
   *
   * * `serviceAccount:{emailid}`: An email address that represents a service    account. For
   * example, `my-other-app@appspot.gserviceaccount.com`.
   *
   * * `group:{emailid}`: An email address that represents a Google group.    For example,
   * `admins@example.com`.
   *
   * * `domain:{domain}`: The G Suite domain (primary) that represents all the    users of that
   * domain. For example, `google.com` or `example.com`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> members;

  /**
   * Role that is assigned to `members`. For example, `roles/viewer`, `roles/editor`, or
   * `roles/owner`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String role;

  /**
   * Unimplemented. The condition that is associated with this binding. NOTE: an unsatisfied
   * condition will not allow user access via current binding. Different bindings, including their
   * conditions, are examined independently.
   * @return value or {@code null} for none
   */
  public Expr getCondition() {
    return condition;
  }

  /**
   * Unimplemented. The condition that is associated with this binding. NOTE: an unsatisfied
   * condition will not allow user access via current binding. Different bindings, including their
   * conditions, are examined independently.
   * @param condition condition or {@code null} for none
   */
  public Binding setCondition(Expr condition) {
    this.condition = condition;
    return this;
  }

  /**
   * Specifies the identities requesting access for a Cloud Platform resource. `members` can have
   * the following values:
   *
   * * `allUsers`: A special identifier that represents anyone who is    on the internet; with or
   * without a Google account.
   *
   * * `allAuthenticatedUsers`: A special identifier that represents anyone    who is authenticated
   * with a Google account or a service account.
   *
   * * `user:{emailid}`: An email address that represents a specific Google    account. For example,
   * `alice@gmail.com` .
   *
   * * `serviceAccount:{emailid}`: An email address that represents a service    account. For
   * example, `my-other-app@appspot.gserviceaccount.com`.
   *
   * * `group:{emailid}`: An email address that represents a Google group.    For example,
   * `admins@example.com`.
   *
   * * `domain:{domain}`: The G Suite domain (primary) that represents all the    users of that
   * domain. For example, `google.com` or `example.com`.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getMembers() {
    return members;
  }

  /**
   * Specifies the identities requesting access for a Cloud Platform resource. `members` can have
   * the following values:
   *
   * * `allUsers`: A special identifier that represents anyone who is    on the internet; with or
   * without a Google account.
   *
   * * `allAuthenticatedUsers`: A special identifier that represents anyone    who is authenticated
   * with a Google account or a service account.
   *
   * * `user:{emailid}`: An email address that represents a specific Google    account. For example,
   * `alice@gmail.com` .
   *
   * * `serviceAccount:{emailid}`: An email address that represents a service    account. For
   * example, `my-other-app@appspot.gserviceaccount.com`.
   *
   * * `group:{emailid}`: An email address that represents a Google group.    For example,
   * `admins@example.com`.
   *
   * * `domain:{domain}`: The G Suite domain (primary) that represents all the    users of that
   * domain. For example, `google.com` or `example.com`.
   * @param members members or {@code null} for none
   */
  public Binding setMembers(java.util.List<java.lang.String> members) {
    this.members = members;
    return this;
  }

  /**
   * Role that is assigned to `members`. For example, `roles/viewer`, `roles/editor`, or
   * `roles/owner`.
   * @return value or {@code null} for none
   */
  public java.lang.String getRole() {
    return role;
  }

  /**
   * Role that is assigned to `members`. For example, `roles/viewer`, `roles/editor`, or
   * `roles/owner`.
   * @param role role or {@code null} for none
   */
  public Binding setRole(java.lang.String role) {
    this.role = role;
    return this;
  }

  @Override
  public Binding set(String fieldName, Object value) {
    return (Binding) super.set(fieldName, value);
  }

  @Override
  public Binding clone() {
    return (Binding) super.clone();
  }

}

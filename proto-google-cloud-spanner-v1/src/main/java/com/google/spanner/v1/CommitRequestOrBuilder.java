/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/spanner/v1/spanner.proto

// Protobuf Java Version: 3.25.5
package com.google.spanner.v1;

public interface CommitRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.spanner.v1.CommitRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The session in which the transaction to be committed is running.
   * </pre>
   *
   * <code>
   * string session = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The session.
   */
  java.lang.String getSession();
  /**
   *
   *
   * <pre>
   * Required. The session in which the transaction to be committed is running.
   * </pre>
   *
   * <code>
   * string session = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for session.
   */
  com.google.protobuf.ByteString getSessionBytes();

  /**
   *
   *
   * <pre>
   * Commit a previously-started transaction.
   * </pre>
   *
   * <code>bytes transaction_id = 2;</code>
   *
   * @return Whether the transactionId field is set.
   */
  boolean hasTransactionId();
  /**
   *
   *
   * <pre>
   * Commit a previously-started transaction.
   * </pre>
   *
   * <code>bytes transaction_id = 2;</code>
   *
   * @return The transactionId.
   */
  com.google.protobuf.ByteString getTransactionId();

  /**
   *
   *
   * <pre>
   * Execute mutations in a temporary transaction. Note that unlike
   * commit of a previously-started transaction, commit with a
   * temporary transaction is non-idempotent. That is, if the
   * `CommitRequest` is sent to Cloud Spanner more than once (for
   * instance, due to retries in the application, or in the
   * transport library), it is possible that the mutations are
   * executed more than once. If this is undesirable, use
   * [BeginTransaction][google.spanner.v1.Spanner.BeginTransaction] and
   * [Commit][google.spanner.v1.Spanner.Commit] instead.
   * </pre>
   *
   * <code>.google.spanner.v1.TransactionOptions single_use_transaction = 3;</code>
   *
   * @return Whether the singleUseTransaction field is set.
   */
  boolean hasSingleUseTransaction();
  /**
   *
   *
   * <pre>
   * Execute mutations in a temporary transaction. Note that unlike
   * commit of a previously-started transaction, commit with a
   * temporary transaction is non-idempotent. That is, if the
   * `CommitRequest` is sent to Cloud Spanner more than once (for
   * instance, due to retries in the application, or in the
   * transport library), it is possible that the mutations are
   * executed more than once. If this is undesirable, use
   * [BeginTransaction][google.spanner.v1.Spanner.BeginTransaction] and
   * [Commit][google.spanner.v1.Spanner.Commit] instead.
   * </pre>
   *
   * <code>.google.spanner.v1.TransactionOptions single_use_transaction = 3;</code>
   *
   * @return The singleUseTransaction.
   */
  com.google.spanner.v1.TransactionOptions getSingleUseTransaction();
  /**
   *
   *
   * <pre>
   * Execute mutations in a temporary transaction. Note that unlike
   * commit of a previously-started transaction, commit with a
   * temporary transaction is non-idempotent. That is, if the
   * `CommitRequest` is sent to Cloud Spanner more than once (for
   * instance, due to retries in the application, or in the
   * transport library), it is possible that the mutations are
   * executed more than once. If this is undesirable, use
   * [BeginTransaction][google.spanner.v1.Spanner.BeginTransaction] and
   * [Commit][google.spanner.v1.Spanner.Commit] instead.
   * </pre>
   *
   * <code>.google.spanner.v1.TransactionOptions single_use_transaction = 3;</code>
   */
  com.google.spanner.v1.TransactionOptionsOrBuilder getSingleUseTransactionOrBuilder();

  /**
   *
   *
   * <pre>
   * The mutations to be executed when this transaction commits. All
   * mutations are applied atomically, in the order they appear in
   * this list.
   * </pre>
   *
   * <code>repeated .google.spanner.v1.Mutation mutations = 4;</code>
   */
  java.util.List<com.google.spanner.v1.Mutation> getMutationsList();
  /**
   *
   *
   * <pre>
   * The mutations to be executed when this transaction commits. All
   * mutations are applied atomically, in the order they appear in
   * this list.
   * </pre>
   *
   * <code>repeated .google.spanner.v1.Mutation mutations = 4;</code>
   */
  com.google.spanner.v1.Mutation getMutations(int index);
  /**
   *
   *
   * <pre>
   * The mutations to be executed when this transaction commits. All
   * mutations are applied atomically, in the order they appear in
   * this list.
   * </pre>
   *
   * <code>repeated .google.spanner.v1.Mutation mutations = 4;</code>
   */
  int getMutationsCount();
  /**
   *
   *
   * <pre>
   * The mutations to be executed when this transaction commits. All
   * mutations are applied atomically, in the order they appear in
   * this list.
   * </pre>
   *
   * <code>repeated .google.spanner.v1.Mutation mutations = 4;</code>
   */
  java.util.List<? extends com.google.spanner.v1.MutationOrBuilder> getMutationsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The mutations to be executed when this transaction commits. All
   * mutations are applied atomically, in the order they appear in
   * this list.
   * </pre>
   *
   * <code>repeated .google.spanner.v1.Mutation mutations = 4;</code>
   */
  com.google.spanner.v1.MutationOrBuilder getMutationsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * If `true`, then statistics related to the transaction will be included in
   * the [CommitResponse][google.spanner.v1.CommitResponse.commit_stats].
   * Default value is `false`.
   * </pre>
   *
   * <code>bool return_commit_stats = 5;</code>
   *
   * @return The returnCommitStats.
   */
  boolean getReturnCommitStats();

  /**
   *
   *
   * <pre>
   * Optional. The amount of latency this request is willing to incur in order
   * to improve throughput. If this field is not set, Spanner assumes requests
   * are relatively latency sensitive and automatically determines an
   * appropriate delay time. You can specify a batching delay value between 0
   * and 500 ms.
   * </pre>
   *
   * <code>.google.protobuf.Duration max_commit_delay = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the maxCommitDelay field is set.
   */
  boolean hasMaxCommitDelay();
  /**
   *
   *
   * <pre>
   * Optional. The amount of latency this request is willing to incur in order
   * to improve throughput. If this field is not set, Spanner assumes requests
   * are relatively latency sensitive and automatically determines an
   * appropriate delay time. You can specify a batching delay value between 0
   * and 500 ms.
   * </pre>
   *
   * <code>.google.protobuf.Duration max_commit_delay = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The maxCommitDelay.
   */
  com.google.protobuf.Duration getMaxCommitDelay();
  /**
   *
   *
   * <pre>
   * Optional. The amount of latency this request is willing to incur in order
   * to improve throughput. If this field is not set, Spanner assumes requests
   * are relatively latency sensitive and automatically determines an
   * appropriate delay time. You can specify a batching delay value between 0
   * and 500 ms.
   * </pre>
   *
   * <code>.google.protobuf.Duration max_commit_delay = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.DurationOrBuilder getMaxCommitDelayOrBuilder();

  /**
   *
   *
   * <pre>
   * Common options for this request.
   * </pre>
   *
   * <code>.google.spanner.v1.RequestOptions request_options = 6;</code>
   *
   * @return Whether the requestOptions field is set.
   */
  boolean hasRequestOptions();
  /**
   *
   *
   * <pre>
   * Common options for this request.
   * </pre>
   *
   * <code>.google.spanner.v1.RequestOptions request_options = 6;</code>
   *
   * @return The requestOptions.
   */
  com.google.spanner.v1.RequestOptions getRequestOptions();
  /**
   *
   *
   * <pre>
   * Common options for this request.
   * </pre>
   *
   * <code>.google.spanner.v1.RequestOptions request_options = 6;</code>
   */
  com.google.spanner.v1.RequestOptionsOrBuilder getRequestOptionsOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. If the read-write transaction was executed on a multiplexed
   * session, the precommit token with the highest sequence number received in
   * this transaction attempt, should be included here. Failing to do so will
   * result in a FailedPrecondition error.
   * This feature is not yet supported and will result in an UNIMPLEMENTED
   * error.
   * </pre>
   *
   * <code>
   * .google.spanner.v1.MultiplexedSessionPrecommitToken precommit_token = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the precommitToken field is set.
   */
  boolean hasPrecommitToken();
  /**
   *
   *
   * <pre>
   * Optional. If the read-write transaction was executed on a multiplexed
   * session, the precommit token with the highest sequence number received in
   * this transaction attempt, should be included here. Failing to do so will
   * result in a FailedPrecondition error.
   * This feature is not yet supported and will result in an UNIMPLEMENTED
   * error.
   * </pre>
   *
   * <code>
   * .google.spanner.v1.MultiplexedSessionPrecommitToken precommit_token = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The precommitToken.
   */
  com.google.spanner.v1.MultiplexedSessionPrecommitToken getPrecommitToken();
  /**
   *
   *
   * <pre>
   * Optional. If the read-write transaction was executed on a multiplexed
   * session, the precommit token with the highest sequence number received in
   * this transaction attempt, should be included here. Failing to do so will
   * result in a FailedPrecondition error.
   * This feature is not yet supported and will result in an UNIMPLEMENTED
   * error.
   * </pre>
   *
   * <code>
   * .google.spanner.v1.MultiplexedSessionPrecommitToken precommit_token = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.spanner.v1.MultiplexedSessionPrecommitTokenOrBuilder getPrecommitTokenOrBuilder();

  com.google.spanner.v1.CommitRequest.TransactionCase getTransactionCase();
}

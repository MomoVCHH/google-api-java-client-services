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

package com.google.api.services.compute.model;

/**
 * CPU utilization policy.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AutoscalingPolicyCpuUtilization extends com.google.api.client.json.GenericJson {

  /**
   * Indicates which method of prediction is used for CPU utilization metric, if any. Current set of
   * possible values: * NONE: No predictions are made based on the scaling metric when calculating
   * the number of VM instances. * STANDARD: Standard predictive autoscaling predicts the future
   * values of the scaling metric and then scales a MIG to ensure that new VM instances are ready in
   * time to cover the predicted peak. New values might be added in the future. Some of the values
   * might not be available in all API versions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String predictiveMethod;

  /**
   * The target CPU utilization that the autoscaler should maintain. Must be a float value in the
   * range (0, 1]. If not specified, the default is 0.6.
   *
   * If the CPU level is below the target utilization, the autoscaler scales down the number of
   * instances until it reaches the minimum number of instances you specified or until the average
   * CPU of your instances reaches the target utilization.
   *
   * If the average CPU is above the target utilization, the autoscaler scales up until it reaches
   * the maximum number of instances you specified or until the average utilization reaches the
   * target utilization.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double utilizationTarget;

  /**
   * Indicates which method of prediction is used for CPU utilization metric, if any. Current set of
   * possible values: * NONE: No predictions are made based on the scaling metric when calculating
   * the number of VM instances. * STANDARD: Standard predictive autoscaling predicts the future
   * values of the scaling metric and then scales a MIG to ensure that new VM instances are ready in
   * time to cover the predicted peak. New values might be added in the future. Some of the values
   * might not be available in all API versions.
   * @return value or {@code null} for none
   */
  public java.lang.String getPredictiveMethod() {
    return predictiveMethod;
  }

  /**
   * Indicates which method of prediction is used for CPU utilization metric, if any. Current set of
   * possible values: * NONE: No predictions are made based on the scaling metric when calculating
   * the number of VM instances. * STANDARD: Standard predictive autoscaling predicts the future
   * values of the scaling metric and then scales a MIG to ensure that new VM instances are ready in
   * time to cover the predicted peak. New values might be added in the future. Some of the values
   * might not be available in all API versions.
   * @param predictiveMethod predictiveMethod or {@code null} for none
   */
  public AutoscalingPolicyCpuUtilization setPredictiveMethod(java.lang.String predictiveMethod) {
    this.predictiveMethod = predictiveMethod;
    return this;
  }

  /**
   * The target CPU utilization that the autoscaler should maintain. Must be a float value in the
   * range (0, 1]. If not specified, the default is 0.6.
   *
   * If the CPU level is below the target utilization, the autoscaler scales down the number of
   * instances until it reaches the minimum number of instances you specified or until the average
   * CPU of your instances reaches the target utilization.
   *
   * If the average CPU is above the target utilization, the autoscaler scales up until it reaches
   * the maximum number of instances you specified or until the average utilization reaches the
   * target utilization.
   * @return value or {@code null} for none
   */
  public java.lang.Double getUtilizationTarget() {
    return utilizationTarget;
  }

  /**
   * The target CPU utilization that the autoscaler should maintain. Must be a float value in the
   * range (0, 1]. If not specified, the default is 0.6.
   *
   * If the CPU level is below the target utilization, the autoscaler scales down the number of
   * instances until it reaches the minimum number of instances you specified or until the average
   * CPU of your instances reaches the target utilization.
   *
   * If the average CPU is above the target utilization, the autoscaler scales up until it reaches
   * the maximum number of instances you specified or until the average utilization reaches the
   * target utilization.
   * @param utilizationTarget utilizationTarget or {@code null} for none
   */
  public AutoscalingPolicyCpuUtilization setUtilizationTarget(java.lang.Double utilizationTarget) {
    this.utilizationTarget = utilizationTarget;
    return this;
  }

  @Override
  public AutoscalingPolicyCpuUtilization set(String fieldName, Object value) {
    return (AutoscalingPolicyCpuUtilization) super.set(fieldName, value);
  }

  @Override
  public AutoscalingPolicyCpuUtilization clone() {
    return (AutoscalingPolicyCpuUtilization) super.clone();
  }

}

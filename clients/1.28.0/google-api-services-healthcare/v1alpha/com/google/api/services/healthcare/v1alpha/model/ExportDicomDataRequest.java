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

package com.google.api.services.healthcare.v1alpha.model;

/**
 * Exports data from the specified DICOM store. If a given resource (e.g., a DICOM object with the
 * same SOPInstance UID) already exists in the output, it is overwritten with the version in the
 * source dataset. Exported DICOM data will persist when the DICOM store from which it was exported
 * is deleted.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Healthcare API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ExportDicomDataRequest extends com.google.api.client.json.GenericJson {

  /**
   * Specifies where the exported data should be placed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OutputConfig outputConfig;

  /**
   * Specifies where the exported data should be placed.
   * @return value or {@code null} for none
   */
  public OutputConfig getOutputConfig() {
    return outputConfig;
  }

  /**
   * Specifies where the exported data should be placed.
   * @param outputConfig outputConfig or {@code null} for none
   */
  public ExportDicomDataRequest setOutputConfig(OutputConfig outputConfig) {
    this.outputConfig = outputConfig;
    return this;
  }

  @Override
  public ExportDicomDataRequest set(String fieldName, Object value) {
    return (ExportDicomDataRequest) super.set(fieldName, value);
  }

  @Override
  public ExportDicomDataRequest clone() {
    return (ExportDicomDataRequest) super.clone();
  }

}

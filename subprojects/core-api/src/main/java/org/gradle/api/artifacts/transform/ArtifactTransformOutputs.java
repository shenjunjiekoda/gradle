/*
 * Copyright 2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.gradle.api.artifacts.transform;

import org.gradle.api.Incubating;
import org.gradle.internal.HasInternalProtocol;

import java.io.File;

/**
 * The outputs of the artifact transform.
 *
 * @since 5.3
 */
@Incubating
@HasInternalProtocol
public interface ArtifactTransformOutputs {
    /**
     * Registers an output file of the transform.
     *
     * <p>The order of calls to this method is retained in the result of the transform.</p>
     */
    void registerOutput(File outputFile);

    /**
     * Returns the <em>workspace</em> location for this transform, which is the directory that the transform should write its output files to.
     */
    File getWorkspace();
}
/*
 * Copyright 2017 original authors
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 */
package org.particleframework.inject;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

/**
 * <p>Represents a handle to an executable object. Differs from {@link Executable} in that the first argument to {@link #invoke(Object...)} is
 * not the object instead the object is typically held within the handle itself</p>
 *
 * <p>Executable handles are also applicable to constructors and static methods</p>
 *
 * @author Graeme Rocher
 * @since 1.0
 */
public interface ExecutionHandle<R> extends AnnotatedElement {

    /**
     * @return The declaring type
     */
    Class getDeclaringType();
    /**
     * The required argument types
     */
    Argument[] getArguments();

    /**
     * Invokes the method
     *
     * @param arguments The arguments
     *
     * @return The result
     */
    R invoke(Object... arguments);

}

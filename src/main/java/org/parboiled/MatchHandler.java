/*
 * Copyright (C) 2009-2010 Mathias Doenitz
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

package org.parboiled;

/**
 * A MatchHandler is responsible for actually running the match of a given {@link MatcherContext}.
 * Many times it wraps the actual call to the matcher with some custom logic, e.g. for error handling.
 */
public interface MatchHandler {

    /**
     * Runs the root MatcherContext.
     *
     * @param rootContext the root MatcherContext.
     * @return true if matched
     */
    boolean matchRoot(MatcherContext<?> rootContext);

    /**
     * Runs the given MatcherContext.
     *
     * @param context the MatcherContext
     * @return true if matched
     */
    boolean match(MatcherContext<?> context);

}
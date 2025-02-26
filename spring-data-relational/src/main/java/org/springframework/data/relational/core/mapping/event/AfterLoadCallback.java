/*
 * Copyright 2019-2021 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.data.relational.core.mapping.event;

import org.springframework.data.mapping.callback.EntityCallback;

/**
 * An {@link EntityCallback} that gets invoked after an aggregate was loaded from the database.
 *
 * @author Jens Schauder
 * @author Mark Paluch
 * @since 1.1
 * @deprecated Use {@link AfterConvertCallback} instead.
 */
@Deprecated
@FunctionalInterface
public interface AfterLoadCallback<T> extends EntityCallback<T> {

	/**
	 * Entity callback method invoked after an aggregate root was loaded. Can return either the same or a modified
	 * instance of the domain object.
	 *
	 * @param aggregate the loaded aggregate.
	 * @return the loaded aggregate.
	 */
	T onAfterLoad(T aggregate);
}

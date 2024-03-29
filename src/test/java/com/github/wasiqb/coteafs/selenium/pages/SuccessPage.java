/**
 * Copyright (c) 2017 - 2020, Wasiq Bhamla.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.wasiqb.coteafs.selenium.pages;

import org.openqa.selenium.By;

import com.github.wasiqb.coteafs.selenium.core.element.IElementActions;

/**
 * @author wasiqb
 * @since Apr 8, 2019 8:14:38 PM
 */
public abstract class SuccessPage extends MainPage {
	/**
	 * @author wasiqb
	 * @since Apr 8, 2019 9:43:54 PM
	 * @return message
	 */
	public IElementActions message () {
		return cell (0, 0);
	}

	protected IElementActions cell (final int row) {
		return cell (row, 1);
	}

	protected IElementActions cell (final int row, final int col) {
		return successTable ().finds (By.tagName ("tr"))
			.get (row)
			.finds (By.tagName ("td"))
			.get (col);
	}

	protected abstract IElementActions successTable ();
}
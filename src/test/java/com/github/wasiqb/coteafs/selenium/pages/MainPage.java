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

import com.github.wasiqb.coteafs.selenium.core.BrowserPage;
import com.github.wasiqb.coteafs.selenium.core.element.IElementActions;
import com.github.wasiqb.coteafs.selenium.core.element.IMouseActions;

/**
 * @author wasiqb
 * @since Aug 31, 2018 8:14:38 PM
 */
public class MainPage extends BrowserPage {
	/**
	 * @author wasiqb
	 * @since Apr 7, 2019 5:39:39 PM
	 * @return manager welcome banner
	 */
	public IElementActions managerIdBanner () {
		return onElement (By.cssSelector ("tr.heading3 > td"));
	}

	/**
	 * @author wasiqb
	 * @since Apr 7, 2019 5:42:12 PM
	 * @param name
	 * @return menu name
	 */
	public IMouseActions navbar (final String name) {
		return (IMouseActions) navbar ().finds (By.cssSelector ("li > a"))
			.stream ()
			.filter (m -> m.text ()
				.trim ()
				.equals (name))
			.findFirst ()
			.get ();
	}

	private IMouseActions navbar () {
		return onElement (By.className ("menusubnav"));
	}
}
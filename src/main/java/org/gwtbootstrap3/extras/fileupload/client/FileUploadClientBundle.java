package org.gwtbootstrap3.extras.fileupload.client;

/*
 * #%L
 * GwtBootstrap3
 * %%
 * Copyright (C) 2013 - 2014 GwtBootstrap3
 * %%
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
 * #L%
 */

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

/**
 * @author Payam Meyer
 */
public interface FileUploadClientBundle extends ClientBundle {

    FileUploadClientBundle INSTANCE = GWT.create(FileUploadClientBundle.class);

    @Source("resources/js/jquery.fileupload.cache.js")
    TextResource fileUpload();

    @Source("resources/js/jquery.fileupload-main.cache.js")
    TextResource fileUploadMain();

    @Source("resources/js/jquery.fileupload-validate.cache.js")
    TextResource fileUploadValidate();

    @Source("resources/js/jquery.iframe-transport.cache.js")
    TextResource fileUploadIframe();
}

package org.gwtbootstrap3.extras.fileupload.client.ui.base;

/*
 * #%L
 * GwtBootstrap3
 * %%
 * Copyright (C) 2013 - 2015 GwtBootstrap3
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

import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Widget;
import org.gwtbootstrap3.client.ui.*;
import org.gwtbootstrap3.client.ui.constants.*;
import org.gwtbootstrap3.client.ui.html.Span;

/**
 * Created by Payam Meyer on 5/11/15.
 */
public class FileUploadBase extends Widget {

    public FileUploadBase() {

        Container container = new Container();

        Form uploadForm = new Form(FormType.DEFAULT);
        uploadForm.getElement().setId("fileupload");
        uploadForm.setAction("upload");
        uploadForm.setMethod("POST");
        uploadForm.setEncoding("multipart/form-data");

        Row buttonsRow = new Row();
        buttonsRow.addStyleName("fileupload-buttonbar");

        Column buttonsColumn = new Column(ColumnSize.LG_7);
        buttonsRow.add(buttonsColumn);

        Span span = new Span();
        span.addStyleName("btn btn-success fileinput-button");
        Icon addIcon = new Icon(IconType.PLUS);
        addIcon.setMarginRight(3);
        Span addFilesSpan = new Span("Add files...");

        Input input = new Input(InputType.FILE);
        input.setName("files[]");

        span.add(addIcon);
        span.add(addFilesSpan);
        span.add(input);

        Button submitButton = new Button("Start upload");
        submitButton.setType(ButtonType.PRIMARY);
        submitButton.setMarginLeft(5);
        submitButton.setIcon(IconType.UPLOAD);
        submitButton.setIconPosition(IconPosition.LEFT);
        submitButton.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent clickEvent) {
                initFileUpload();
            }
        });

        Button cancelButton = new Button("Cancel upload");
        cancelButton.setType(ButtonType.WARNING);
        cancelButton.setMarginLeft(5);
        cancelButton.setIcon(IconType.BAN);
        cancelButton.setIconPosition(IconPosition.LEFT);

        Button deleteButton = new Button("Delete");
        deleteButton.setType(ButtonType.DANGER);
        deleteButton.setMarginLeft(5);
        deleteButton.setIcon(IconType.TRASH);
        deleteButton.setIconPosition(IconPosition.LEFT);

        buttonsColumn.add(span);
        buttonsColumn.add(submitButton);
        buttonsColumn.add(cancelButton);
        buttonsColumn.add(deleteButton);

        uploadForm.add(buttonsRow);

        container.add(uploadForm);




        setElement((Element) container.getElement());

    }

    @Override
    protected void onLoad() {
        super.onLoad();
    }

    private native void initFileUpload() /*-{
        $wnd.jQuery(e).fileupload({
            url: '/path/to/upload/handler.json',
            sequentialUploads: true
        });
    }-*/;

}

package ru.datatekh.practice.consoleApp.serveces.factories;

import ru.datatekh.practice.consoleApp.model.document.Document;

/**
 * Created by Света on 22.06.2016.
 */
public interface BaseDocumentFactory {
 Document createDocument(String type);
}

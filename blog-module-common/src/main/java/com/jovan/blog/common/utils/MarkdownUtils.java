/*
package com.jovan.blog.common.utils;

import org.commonmark.Extension;
import org.commonmark.ext.gfm.tables.TableBlock;
import org.commonmark.ext.gfm.tables.TablesExtension;
import org.commonmark.ext.task.list.items.TaskListItemsExtension;
import org.commonmark.node.Node;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.AttributeProvider;
import org.commonmark.renderer.html.HtmlRenderer;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

*/
/**
 * Markdown工具类
 *//*

public class MarkdownUtils {
    
    private static final List<Extension> extensions = Arrays.asList(
            TablesExtension.create(),
            TaskListItemsExtension.create()
    );
    
    private static final Parser parser = Parser.builder()
            .extensions(extensions)
            .build();
    
    private static final HtmlRenderer renderer = HtmlRenderer.builder()
            .extensions(extensions)
            .attributeProviderFactory(context -> new CustomAttributeProvider())
            .build();
    
    */
/**
     * 将Markdown文本转换为HTML
     *//*

    public static String markdownToHtml(String markdown) {
        if (markdown == null || markdown.trim().isEmpty()) {
            return "";
        }
        Node document = parser.parse(markdown);
        return renderer.render(document);
    }
    
    */
/**
     * 自定义属性提供器，用于添加CSS类等
     *//*

    static class CustomAttributeProvider implements AttributeProvider {
        @Override
        public void setAttributes(Node node, String tagName, Map<String, String> attributes) {
            // 为表格添加Bootstrap类
            if (node instanceof TableBlock) {
                attributes.put("class", "table table-bordered");
            }
        }
    }
} */

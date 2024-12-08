/*
package com.jovan.blog.common.utils;

import com.itextpdf.html2pdf.HtmlConverter;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

*/
/**
 * 导出工具类
 *//*

@Slf4j
public class ExportUtils {
    
    */
/**
     * 导出为PDF
     *//*

    public static byte[] exportToPDF(String title, String htmlContent, String authorName, String createTime) {
        try (ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {
            PdfWriter writer = new PdfWriter(outputStream);
            PdfDocument pdf = new PdfDocument(writer);
            
            // 使用模板生成HTML
            String fullHtml = TemplateUtils.generateArticleHtml(title, htmlContent, authorName, createTime);
            
            // 转换HTML为PDF
            HtmlConverter.convertToPdf(fullHtml, pdf);
            
            return outputStream.toByteArray();
        } catch (IOException e) {
            log.error("导出PDF失败", e);
            throw new RuntimeException("导出PDF失败", e);
        }
    }
    
    */
/**
     * 导出为Word
     *//*

    public static byte[] exportToWord(String title, String content, String authorName, String createTime) {
        try (XWPFDocument document = new XWPFDocument();
             ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {
            
            // 添加标题
            XWPFParagraph titleParagraph = document.createParagraph();
            XWPFRun titleRun = titleParagraph.createRun();
            titleRun.setText(title);
            titleRun.setBold(true);
            titleRun.setFontSize(24);
            titleRun.setFontFamily("Arial");
            
            // 添加元信息
            XWPFParagraph metaParagraph = document.createParagraph();
            XWPFRun metaRun = metaParagraph.createRun();
            metaRun.setText(String.format("作者：%s | 发布时间：%s", authorName, createTime));
            metaRun.setFontSize(12);
            metaRun.setFontFamily("Arial");
            metaRun.setColor("666666");
            
            // 添加内容
            XWPFParagraph contentParagraph = document.createParagraph();
            XWPFRun contentRun = contentParagraph.createRun();
            contentRun.setText(content);
            contentRun.setFontSize(14);
            contentRun.setFontFamily("Arial");
            
            document.write(outputStream);
            return outputStream.toByteArray();
        } catch (IOException e) {
            log.error("导出Word失败", e);
            throw new RuntimeException("导出Word失败", e);
        }
    }
} */

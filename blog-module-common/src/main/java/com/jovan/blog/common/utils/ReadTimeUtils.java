package com.jovan.blog.common.utils;

/**
 * 阅读时长计算工具类
 */
public class ReadTimeUtils {
    
    /**
     * 中文阅读速度（字/分钟）
     */
    private static final int CHINESE_WORDS_PER_MINUTE = 300;
    
    /**
     * 英文阅读速度（词/分钟）
     */
    private static final int ENGLISH_WORDS_PER_MINUTE = 200;
    
    /**
     * 计算阅读时长（分钟）
     *
     * @param content Markdown内容
     * @return 阅读时长
     */
    public static int calculateReadTime(String content) {
        if (content == null || content.trim().isEmpty()) {
            return 0;
        }
        
        // 移除Markdown标记
        content = content.replaceAll("!?\\[.*?\\]\\(.*?\\)", "")  // 移除链接和图片
                .replaceAll("#+ ", "")  // 移除标题标记
                .replaceAll("[*_~`]", "")  // 移除强调标记
                .replaceAll("\\{.*?\\}", "")  // 移除其他标记
                .trim();
        
        // 统计中文字符
        int chineseCount = (int) content.chars()
                .filter(ch -> ch >= 0x4E00 && ch <= 0x9FA5)
                .count();
        
        // 统计英文单词
        String[] englishWords = content.replaceAll("[^a-zA-Z\\s]", " ")
                .trim()
                .split("\\s+");
        int englishCount = englishWords.length;
        
        // 计算总阅读时间（分钟）
        double chineseTime = (double) chineseCount / CHINESE_WORDS_PER_MINUTE;
        double englishTime = (double) englishCount / ENGLISH_WORDS_PER_MINUTE;
        
        // 向上取整，最小为1分钟
        return Math.max(1, (int) Math.ceil(chineseTime + englishTime));
    }
} 
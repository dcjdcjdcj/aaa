package com.atguigu.aaa.export;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.atguigu.aaa.entity.ExcelProductDTO;
import com.atguigu.aaa.util.EasyExcelUtil;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.swing.filechooser.FileSystemView;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Locale;

/**
 * @author dcj
 * @Desc
 * @Date 2022/10/26 23:42
 */
@Slf4j
public class exportProduct {

    public static void exportProductData(HttpServletResponse response) {

        //获取当前桌面路径  直接导出文件到桌面上
        String path = "D:/ceshi";
        String fileName = "产品数据表" + System.currentTimeMillis() + ".xlsx";
        String exportFileName = path + "/" + fileName;
        //编码问题
        try {
            fileName = URLEncoder.encode(fileName, "UTF-8").replaceAll("\\+", "%20");

            response.setContentType("application/vnd.ms-excel;charset=utf-8");
            response.setCharacterEncoding("utf-8");
            response.setDateHeader("Expires", -1);
            //设置响应头部信息，格式为附件，以及文件名
            response.setHeader("Content-disposition", "attachment;filename*=utf-8''" + fileName);

            ExcelWriter excelWriter = EasyExcel.write(exportFileName).build();
            WriteSheet writeSheet = EasyExcelUtil.writeSelectedSheet(ExcelProductDTO.class, 0, "产品信息表");
            //此处只导出实体类中的数据所以只new 一个空的list，如果想导出数据库数据需要从数据库中查询数据list
            excelWriter.write(new ArrayList<ExcelProductDTO>(), writeSheet);
            excelWriter.finish();
        } catch (UnsupportedEncodingException e) {
            log.error("导出Excel编码异常", e.getMessage());
        } catch (IOException e) {
            log.error("导出Excel文件异常", e.getMessage());
        }
    }

    public static void main(String[] args) {
        HttpServletResponse response=new HttpServletResponse() {
            @Override
            public void addCookie(Cookie cookie) {

            }

            @Override
            public boolean containsHeader(String s) {
                return false;
            }

            @Override
            public String encodeURL(String s) {
                return null;
            }

            @Override
            public String encodeRedirectURL(String s) {
                return null;
            }

            @Override
            public String encodeUrl(String s) {
                return null;
            }

            @Override
            public String encodeRedirectUrl(String s) {
                return null;
            }

            @Override
            public void sendError(int i, String s) throws IOException {

            }

            @Override
            public void sendError(int i) throws IOException {

            }

            @Override
            public void sendRedirect(String s) throws IOException {

            }

            @Override
            public void setDateHeader(String s, long l) {

            }

            @Override
            public void addDateHeader(String s, long l) {

            }

            @Override
            public void setHeader(String s, String s1) {

            }

            @Override
            public void addHeader(String s, String s1) {

            }

            @Override
            public void setIntHeader(String s, int i) {

            }

            @Override
            public void addIntHeader(String s, int i) {

            }

            @Override
            public void setStatus(int i) {

            }

            @Override
            public void setStatus(int i, String s) {

            }

            @Override
            public String getCharacterEncoding() {
                return null;
            }

            @Override
            public String getContentType() {
                return null;
            }

            @Override
            public ServletOutputStream getOutputStream() throws IOException {
                return null;
            }

            @Override
            public PrintWriter getWriter() throws IOException {
                return null;
            }

            @Override
            public void setCharacterEncoding(String s) {

            }

            @Override
            public void setContentLength(int i) {

            }

            @Override
            public void setContentType(String s) {

            }

            @Override
            public void setBufferSize(int i) {

            }

            @Override
            public int getBufferSize() {
                return 0;
            }

            @Override
            public void flushBuffer() throws IOException {

            }

            @Override
            public void resetBuffer() {

            }

            @Override
            public boolean isCommitted() {
                return false;
            }

            @Override
            public void reset() {

            }

            @Override
            public void setLocale(Locale locale) {

            }

            @Override
            public Locale getLocale() {
                return null;
            }
        };
        exportProductData(response);
    }
}

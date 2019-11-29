package com.jikaigg.base.io.file;

import java.io.File;
import java.io.FileFilter;

/*
创建过滤器FileFilter的实现类，重写过滤方法accept，定义过滤规则
*/
public class FileFilterImpl implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        File[] f = pathname.listFiles();
        for (File file : f) {
            if (file.getName().endsWith(".txt")) {
                return true;
            } else {
                return accept(file);
            }
        }
        return true;
    }
}

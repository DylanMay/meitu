package com.hadisi.meitu.entities;

import java.io.Serializable;
import java.util.List;

/**
 * Created by wugang on 2016/6/30.
 */

public class PicSearch {

    /**
     * showapi_res_code : 0
     * showapi_res_error :
     * showapi_res_body :
     */

    private int showapi_res_code;
    private String showapi_res_error;
    /**
     * ret_code : 0
     * pagebean :
     */

    private ShowapiResBodyBean showapi_res_body;

    public int getShowapi_res_code() {
        return showapi_res_code;
    }

    public void setShowapi_res_code(int showapi_res_code) {
        this.showapi_res_code = showapi_res_code;
    }

    public String getShowapi_res_error() {
        return showapi_res_error;
    }

    public void setShowapi_res_error(String showapi_res_error) {
        this.showapi_res_error = showapi_res_error;
    }

    public ShowapiResBodyBean getShowapi_res_body() {
        return showapi_res_body;
    }

    public void setShowapi_res_body(ShowapiResBodyBean showapi_res_body) {
        this.showapi_res_body = showapi_res_body;
    }

    public static class ShowapiResBodyBean {
        private int ret_code;
        /**
         * allPages : 58
         * contentlist :
         * currentPage : 1
         * allNum : 1158
         * maxResult : 20
         */

        private PagebeanBean pagebean;

        public int getRet_code() {
            return ret_code;
        }

        public void setRet_code(int ret_code) {
            this.ret_code = ret_code;
        }

        public PagebeanBean getPagebean() {
            return pagebean;
        }

        public void setPagebean(PagebeanBean pagebean) {
            this.pagebean = pagebean;
        }

        public static class PagebeanBean {
            private int allPages;
            private int currentPage;
            private int allNum;
            private int maxResult;
            /**
             * typeName : 日韩美女
             * title : 日本人气女星中村静香闺房写真清新诱惑
             * type : 4014
             * itemId : 103043891
             * ct : 2016-06-14 04:20:10.640
             */

            private List<ContentlistBean> contentlist;

            public int getAllPages() {
                return allPages;
            }

            public void setAllPages(int allPages) {
                this.allPages = allPages;
            }

            public int getCurrentPage() {
                return currentPage;
            }

            public void setCurrentPage(int currentPage) {
                this.currentPage = currentPage;
            }

            public int getAllNum() {
                return allNum;
            }

            public void setAllNum(int allNum) {
                this.allNum = allNum;
            }

            public int getMaxResult() {
                return maxResult;
            }

            public void setMaxResult(int maxResult) {
                this.maxResult = maxResult;
            }

            public List<ContentlistBean> getContentlist() {
                return contentlist;
            }

            public void setContentlist(List<ContentlistBean> contentlist) {
                this.contentlist = contentlist;
            }

            public static class ContentlistBean implements Serializable{
                private String typeName;
                private String title;
                private int type;
                private String itemId;
                private String ct;
                /**
                 * big : http://image.tianjimedia.com/uploadImages/2016/165/36/A1QH488LOHCY.jpg
                 * small : http://image.tianjimedia.com/uploadImages/2016/165/36/A1QH488LOHCY_113.jpg
                 * middle : http://image.tianjimedia.com/uploadImages/2016/165/36/A1QH488LOHCY_680x500.jpg
                 */

                private List<ListBean> list;

                public String getTypeName() {
                    return typeName;
                }

                public void setTypeName(String typeName) {
                    this.typeName = typeName;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }

                public String getItemId() {
                    return itemId;
                }

                public void setItemId(String itemId) {
                    this.itemId = itemId;
                }

                public String getCt() {
                    return ct;
                }

                public void setCt(String ct) {
                    this.ct = ct;
                }

                public List<ListBean> getList() {
                    return list;
                }

                public void setList(List<ListBean> list) {
                    this.list = list;
                }

                public static class ListBean implements Serializable{
                    private String big;
                    private String small;
                    private String middle;

                    public String getBig() {
                        return big;
                    }

                    public void setBig(String big) {
                        this.big = big;
                    }

                    public String getSmall() {
                        return small;
                    }

                    public void setSmall(String small) {
                        this.small = small;
                    }

                    public String getMiddle() {
                        return middle;
                    }

                    public void setMiddle(String middle) {
                        this.middle = middle;
                    }
                }
            }
        }
    }
}

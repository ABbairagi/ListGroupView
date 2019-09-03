package com.example.listgroupview;

class GroupClass {
    private String title;
    private String desc;
    private int image_res;

    GroupClass(String title,String desc,int image_res)
    {
        this.title = title;
        this.desc = desc;
        this.image_res = image_res;
    }

    public int getImage_res() {
        return image_res;
    }

    public void setImage_res(int image_res) {
        this.image_res = image_res;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}

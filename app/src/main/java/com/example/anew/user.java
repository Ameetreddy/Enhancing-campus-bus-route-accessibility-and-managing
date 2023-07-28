package com.example.anew;

public class user {


        public String no,route,time;
    public user(String busno, String route, String time) {
        this.no = busno;
        this.route = route;
        this.time = time;
    }

    public user() {

    }

    public String getNo() {
            return no;
        }

        public String getRoute() {
            return route;
        }

        public String getTime() {
            return time;
        }


}

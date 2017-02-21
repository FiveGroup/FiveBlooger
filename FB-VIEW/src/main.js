//增加扩展方法
if (!String.prototype.includes) {
  String.prototype.includes = function(search, start) {
    'use strict';
    if (typeof start !== 'number') {
      start = 0;
    }
    if (start + search.length > this.length) {
      return false;
    } else {
      return this.indexOf(search, start) !== -1;
    }
  };
}

var Vue = require("vue");
var VueRouter = require("vue-router");
var VueResource = require("vue-resource");
require("./assets/bootstrap2.3.2/css/bootstrap.min.css");
require("./assets/bootstrap2.3.2/css/bootstrap-responsive.min.css");
require("./assets/img/a.jpg");
require("./assets/img/people.jpg");
require("./assets/img/city.jpg");
require("./assets/img/sports.jpg");
//require("./assets/img/first.png");
//require("./assets/css/test.css");
/*require("./assets/js/bootstrap.js");
require("./assets/npm.js");*/
//安装vue-router，vue-resource
Vue.use(VueRouter);
Vue.use(VueResource);

var router = new VueRouter();
var App = Vue.extend({ //这里定义的数据和函数是全局的.调用时用Vue.$root即可；此处与index页面的id=app的div对应
  data:function(){
    return{
      router:router,
      tab:0,
      fg_menu:false
    }
  },
  ready:function(){
    //下面是基于全局变量适用http发送请求的方法，基于实例发请求的方法在list页面
  Vue.http.get("https://wdzt1.wondersgroup.com/api/common/app_list?t=2").then(function(res){
      console.log(res)
    });
    Vue.http.get("https://localhost:8090/src/assets/data.json").then(function(res){
      console.log(res)
    })
  },
  methods:{
    path:function(url) {
      router.go(url);
    },
  }
});

//配置路由
router.map({
  '/word':{
    component:function(resolve){
      require(['./components/menus/home'],resolve)
    },
    subRoutes:{
      '':{
        component:function(resolve){
          require(['./components/contents/word-list'],resolve)
        }
      },
      '/detail':{
        component:function(resolve){
          require(['./components/contents/word-detail'],resolve)
        }
      }
    }
  },
  '/music':{
    component:function(resolve){
      require(['./components/menus/home'],resolve)
    },
    subRoutes:{
      '':{
        component:function(resolve){
          require(['./components/contents/music-list'],resolve)
        }
      },
      '/detail':{
        component:function(resolve){
          require(['./components/contents/music-detail'],resolve)
        }
      }
    }
  },
  '/login':{
    component:function(resolve){
      require(['./components/login/login'],resolve)
    }
  }
});
//路由重定向，除了路由配置的地址，全部跑/main页面
router.redirect({
  '*':'/word'
});

//挂载到#app ,启动项目
router.start(App,'#app');

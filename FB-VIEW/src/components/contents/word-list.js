/**
 * Created by 雅琦 on 2017/2/15.
 */
module.exports={
  template:require('./word-list.html'),
  data:function(){
    return{

    }
  },
  ready:function(){

  },
  methods:{
    open_article:function(id){
      var obj=this;
      obj.$root.path('/word/detail')
    }
  }
}

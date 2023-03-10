YUI.add("aui-form-builder-field-button",function(e,t){var n=e.Lang,r=e.cached(function(e){return e.substring(0,1).toUpperCase()+e.substring(1)}),i=e.Escape,s=e.getClassName,o=s("btn"),u=s("btn","default"),a=s("form-builder-field"),f=s("form-builder-field","node"),l='<button id="{id}" class="'+[f,o,u].join(" ")+'" type="{type}">{value}</button>',c=["submit","reset","button"],h=e.Component.create({NAME:"form-builder-button-field",ATTRS:{acceptChildren:{readOnly:!0,value:!1},buttonType:{validator:function(t){return e.Array(c).indexOf(t.toLowerCase())>-1},value:"submit"},predefinedValue:{value:r("submit")},showLabel:{value:!1},template:{valueFn:function(){return l}}},UI_ATTRS:e.FormBuilderField.UI_ATTRS.concat(["buttonType"]),CSS_PREFIX:a,EXTENDS:e.FormBuilderField,prototype:{getHTML:function(){var e=this;return n.sub(e.get("template"),{id:i.html(e.get("id")),label:i.html(e.get("label")),name:i.html(e.get("name")),type:i.html(e.get("buttonType")),value:i.html(e.get("predefinedValue"))})},getPropertyModel:function(){var t=this,n=t.getStrings(),r=e.FormBuilderButtonField.superclass.getPropertyModel.apply(t,arguments);return r.push({attributeName:"buttonType",editor:new e.RadioCellEditor({options:{button:n.button,reset:n.reset,submit:n.submit}}),name:n.buttonType}),r},_uiSetButtonType:function(e){var t=this,n=t.get("templateNode");n.setAttribute("type",e)},_uiSetPredefinedValue:function(e){var t=this,n=t.get("templateNode");n.setContent(i.html(e))}}});e.FormBuilderButtonField=h,e.FormBuilderField.types.button=e.FormBuilderButtonField},"3.0.0pr2",{requires:["aui-form-builder-field"]});

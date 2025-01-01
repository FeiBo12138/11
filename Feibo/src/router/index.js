import LoginView from "@/views/LoginView.vue";

Vue.use(VueRouter)

const routes = [
    {
        path:'/Login',
        name:'Login',
        composed:LoginView
    },
]
<template>
    <div>
        <table>
            <tr>
                <td>ID</td>
                <td>用户名</td>
                <td>密码</td>
            </tr>
            <tr v-for="user in users">
                <td>{{user.id}}</td>
                <td>{{user.username}}</td>
                <td>{{user.password}}</td>
            </tr>
        </table>

    </div>
</template>

<script>
    export default {
        name: "User",
        data(){
            return {
                msg:"hello,vue",
                users:[{
                    id:1,
                    username:'tom',
                    password:'cat'
                },{
                    id:2,
                    username:'tom2',
                    password:'cat2'
                }
                ]
            }
        },created() {
            const _this=this
            axios.get('http://localhost:8080/user/findAll').then(function (resp) {
                    _this.users=resp.data
            })
        }
    }
</script>

<style scoped>

</style>

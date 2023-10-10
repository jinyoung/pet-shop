<template>
    <v-card outlined>
        <v-card-title>
            DeleteCoupon
        </v-card-title>

        <v-card-text>
            <Date label="IssueDate" v-model="value.issueDate" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="deleteCoupon"
            >
                DeleteCoupon
            </v-btn>
            
            <v-btn
                    color="primary"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'DeleteCouponCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.issueDate = '2023-10-10';
        },
        watch: {
        },
        methods: {
            deleteCoupon() {
                this.$emit('deleteCoupon', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>


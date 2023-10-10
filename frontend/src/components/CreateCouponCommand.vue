<template>
    <v-card outlined>
        <v-card-title>
            CreateCoupon
        </v-card-title>

        <v-card-text>
            <Date label="IssueDate" v-model="value.issueDate" :editMode="editMode"/>
            <Money offline label="Amount" v-model="value.amount" :editMode="editMode" @change="change"/>
            <String label="Issuer" v-model="value.issuer" :editMode="editMode"/>
            <Date label="ExpiryDate" v-model="value.expiryDate" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="createCoupon"
            >
                CreateCoupon
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
        name: 'CreateCouponCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.issueDate = '2023-10-10';
            this.value.amount = {};
            this.value.issuer = '';
            this.value.expiryDate = '2023-10-10';
        },
        watch: {
        },
        methods: {
            createCoupon() {
                this.$emit('createCoupon', this.value);
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


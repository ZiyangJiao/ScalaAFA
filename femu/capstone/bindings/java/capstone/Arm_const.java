// For Capstone Engine. AUTO-GENERATED FILE, DO NOT EDIT
package capstone;

public class Arm_const {

	public static final int ARM_SFT_INVALID = 0;
	public static final int ARM_SFT_ASR = 1;
	public static final int ARM_SFT_LSL = 2;
	public static final int ARM_SFT_LSR = 3;
	public static final int ARM_SFT_ROR = 4;
	public static final int ARM_SFT_RRX = 5;
	public static final int ARM_SFT_ASR_REG = 6;
	public static final int ARM_SFT_LSL_REG = 7;
	public static final int ARM_SFT_LSR_REG = 8;
	public static final int ARM_SFT_ROR_REG = 9;
	public static final int ARM_SFT_RRX_REG = 10;

	public static final int ARM_CC_INVALID = 0;
	public static final int ARM_CC_EQ = 1;
	public static final int ARM_CC_NE = 2;
	public static final int ARM_CC_HS = 3;
	public static final int ARM_CC_LO = 4;
	public static final int ARM_CC_MI = 5;
	public static final int ARM_CC_PL = 6;
	public static final int ARM_CC_VS = 7;
	public static final int ARM_CC_VC = 8;
	public static final int ARM_CC_HI = 9;
	public static final int ARM_CC_LS = 10;
	public static final int ARM_CC_GE = 11;
	public static final int ARM_CC_LT = 12;
	public static final int ARM_CC_GT = 13;
	public static final int ARM_CC_LE = 14;
	public static final int ARM_CC_AL = 15;

	public static final int ARM_SYSREG_INVALID = 0;
	public static final int ARM_SYSREG_SPSR_C = 1;
	public static final int ARM_SYSREG_SPSR_X = 2;
	public static final int ARM_SYSREG_SPSR_S = 4;
	public static final int ARM_SYSREG_SPSR_F = 8;
	public static final int ARM_SYSREG_CPSR_C = 16;
	public static final int ARM_SYSREG_CPSR_X = 32;
	public static final int ARM_SYSREG_CPSR_S = 64;
	public static final int ARM_SYSREG_CPSR_F = 128;
	public static final int ARM_SYSREG_APSR = 256;
	public static final int ARM_SYSREG_APSR_G = 257;
	public static final int ARM_SYSREG_APSR_NZCVQ = 258;
	public static final int ARM_SYSREG_APSR_NZCVQG = 259;
	public static final int ARM_SYSREG_IAPSR = 260;
	public static final int ARM_SYSREG_IAPSR_G = 261;
	public static final int ARM_SYSREG_IAPSR_NZCVQG = 262;
	public static final int ARM_SYSREG_IAPSR_NZCVQ = 263;
	public static final int ARM_SYSREG_EAPSR = 264;
	public static final int ARM_SYSREG_EAPSR_G = 265;
	public static final int ARM_SYSREG_EAPSR_NZCVQG = 266;
	public static final int ARM_SYSREG_EAPSR_NZCVQ = 267;
	public static final int ARM_SYSREG_XPSR = 268;
	public static final int ARM_SYSREG_XPSR_G = 269;
	public static final int ARM_SYSREG_XPSR_NZCVQG = 270;
	public static final int ARM_SYSREG_XPSR_NZCVQ = 271;
	public static final int ARM_SYSREG_IPSR = 272;
	public static final int ARM_SYSREG_EPSR = 273;
	public static final int ARM_SYSREG_IEPSR = 274;
	public static final int ARM_SYSREG_MSP = 275;
	public static final int ARM_SYSREG_PSP = 276;
	public static final int ARM_SYSREG_PRIMASK = 277;
	public static final int ARM_SYSREG_BASEPRI = 278;
	public static final int ARM_SYSREG_BASEPRI_MAX = 279;
	public static final int ARM_SYSREG_FAULTMASK = 280;
	public static final int ARM_SYSREG_CONTROL = 281;
	public static final int ARM_SYSREG_MSPLIM = 282;
	public static final int ARM_SYSREG_PSPLIM = 283;
	public static final int ARM_SYSREG_MSP_NS = 284;
	public static final int ARM_SYSREG_PSP_NS = 285;
	public static final int ARM_SYSREG_MSPLIM_NS = 286;
	public static final int ARM_SYSREG_PSPLIM_NS = 287;
	public static final int ARM_SYSREG_PRIMASK_NS = 288;
	public static final int ARM_SYSREG_BASEPRI_NS = 289;
	public static final int ARM_SYSREG_FAULTMASK_NS = 290;
	public static final int ARM_SYSREG_CONTROL_NS = 291;
	public static final int ARM_SYSREG_SP_NS = 292;
	public static final int ARM_SYSREG_R8_USR = 293;
	public static final int ARM_SYSREG_R9_USR = 294;
	public static final int ARM_SYSREG_R10_USR = 295;
	public static final int ARM_SYSREG_R11_USR = 296;
	public static final int ARM_SYSREG_R12_USR = 297;
	public static final int ARM_SYSREG_SP_USR = 298;
	public static final int ARM_SYSREG_LR_USR = 299;
	public static final int ARM_SYSREG_R8_FIQ = 300;
	public static final int ARM_SYSREG_R9_FIQ = 301;
	public static final int ARM_SYSREG_R10_FIQ = 302;
	public static final int ARM_SYSREG_R11_FIQ = 303;
	public static final int ARM_SYSREG_R12_FIQ = 304;
	public static final int ARM_SYSREG_SP_FIQ = 305;
	public static final int ARM_SYSREG_LR_FIQ = 306;
	public static final int ARM_SYSREG_LR_IRQ = 307;
	public static final int ARM_SYSREG_SP_IRQ = 308;
	public static final int ARM_SYSREG_LR_SVC = 309;
	public static final int ARM_SYSREG_SP_SVC = 310;
	public static final int ARM_SYSREG_LR_ABT = 311;
	public static final int ARM_SYSREG_SP_ABT = 312;
	public static final int ARM_SYSREG_LR_UND = 313;
	public static final int ARM_SYSREG_SP_UND = 314;
	public static final int ARM_SYSREG_LR_MON = 315;
	public static final int ARM_SYSREG_SP_MON = 316;
	public static final int ARM_SYSREG_ELR_HYP = 317;
	public static final int ARM_SYSREG_SP_HYP = 318;
	public static final int ARM_SYSREG_SPSR_FIQ = 319;
	public static final int ARM_SYSREG_SPSR_IRQ = 320;
	public static final int ARM_SYSREG_SPSR_SVC = 321;
	public static final int ARM_SYSREG_SPSR_ABT = 322;
	public static final int ARM_SYSREG_SPSR_UND = 323;
	public static final int ARM_SYSREG_SPSR_MON = 324;
	public static final int ARM_SYSREG_SPSR_HYP = 325;

	public static final int ARM_MB_INVALID = 0;
	public static final int ARM_MB_RESERVED_0 = 1;
	public static final int ARM_MB_OSHLD = 2;
	public static final int ARM_MB_OSHST = 3;
	public static final int ARM_MB_OSH = 4;
	public static final int ARM_MB_RESERVED_4 = 5;
	public static final int ARM_MB_NSHLD = 6;
	public static final int ARM_MB_NSHST = 7;
	public static final int ARM_MB_NSH = 8;
	public static final int ARM_MB_RESERVED_8 = 9;
	public static final int ARM_MB_ISHLD = 10;
	public static final int ARM_MB_ISHST = 11;
	public static final int ARM_MB_ISH = 12;
	public static final int ARM_MB_RESERVED_12 = 13;
	public static final int ARM_MB_LD = 14;
	public static final int ARM_MB_ST = 15;
	public static final int ARM_MB_SY = 16;

	public static final int ARM_OP_INVALID = 0;
	public static final int ARM_OP_REG = 1;
	public static final int ARM_OP_IMM = 2;
	public static final int ARM_OP_MEM = 3;
	public static final int ARM_OP_FP = 4;
	public static final int ARM_OP_CIMM = 64;
	public static final int ARM_OP_PIMM = 65;
	public static final int ARM_OP_SETEND = 66;
	public static final int ARM_OP_SYSREG = 67;

	public static final int ARM_SETEND_INVALID = 0;
	public static final int ARM_SETEND_BE = 1;
	public static final int ARM_SETEND_LE = 2;

	public static final int ARM_CPSMODE_INVALID = 0;
	public static final int ARM_CPSMODE_IE = 2;
	public static final int ARM_CPSMODE_ID = 3;

	public static final int ARM_CPSFLAG_INVALID = 0;
	public static final int ARM_CPSFLAG_F = 1;
	public static final int ARM_CPSFLAG_I = 2;
	public static final int ARM_CPSFLAG_A = 4;
	public static final int ARM_CPSFLAG_NONE = 16;

	public static final int ARM_VECTORDATA_INVALID = 0;
	public static final int ARM_VECTORDATA_I8 = 1;
	public static final int ARM_VECTORDATA_I16 = 2;
	public static final int ARM_VECTORDATA_I32 = 3;
	public static final int ARM_VECTORDATA_I64 = 4;
	public static final int ARM_VECTORDATA_S8 = 5;
	public static final int ARM_VECTORDATA_S16 = 6;
	public static final int ARM_VECTORDATA_S32 = 7;
	public static final int ARM_VECTORDATA_S64 = 8;
	public static final int ARM_VECTORDATA_U8 = 9;
	public static final int ARM_VECTORDATA_U16 = 10;
	public static final int ARM_VECTORDATA_U32 = 11;
	public static final int ARM_VECTORDATA_U64 = 12;
	public static final int ARM_VECTORDATA_P8 = 13;
	public static final int ARM_VECTORDATA_F16 = 14;
	public static final int ARM_VECTORDATA_F32 = 15;
	public static final int ARM_VECTORDATA_F64 = 16;
	public static final int ARM_VECTORDATA_F16F64 = 17;
	public static final int ARM_VECTORDATA_F64F16 = 18;
	public static final int ARM_VECTORDATA_F32F16 = 19;
	public static final int ARM_VECTORDATA_F16F32 = 20;
	public static final int ARM_VECTORDATA_F64F32 = 21;
	public static final int ARM_VECTORDATA_F32F64 = 22;
	public static final int ARM_VECTORDATA_S32F32 = 23;
	public static final int ARM_VECTORDATA_U32F32 = 24;
	public static final int ARM_VECTORDATA_F32S32 = 25;
	public static final int ARM_VECTORDATA_F32U32 = 26;
	public static final int ARM_VECTORDATA_F64S16 = 27;
	public static final int ARM_VECTORDATA_F32S16 = 28;
	public static final int ARM_VECTORDATA_F64S32 = 29;
	public static final int ARM_VECTORDATA_S16F64 = 30;
	public static final int ARM_VECTORDATA_S16F32 = 31;
	public static final int ARM_VECTORDATA_S32F64 = 32;
	public static final int ARM_VECTORDATA_U16F64 = 33;
	public static final int ARM_VECTORDATA_U16F32 = 34;
	public static final int ARM_VECTORDATA_U32F64 = 35;
	public static final int ARM_VECTORDATA_F64U16 = 36;
	public static final int ARM_VECTORDATA_F32U16 = 37;
	public static final int ARM_VECTORDATA_F64U32 = 38;
	public static final int ARM_VECTORDATA_F16U16 = 39;
	public static final int ARM_VECTORDATA_U16F16 = 40;
	public static final int ARM_VECTORDATA_F16U32 = 41;
	public static final int ARM_VECTORDATA_U32F16 = 42;

	public static final int ARM_REG_INVALID = 0;
	public static final int ARM_REG_APSR = 1;
	public static final int ARM_REG_APSR_NZCV = 2;
	public static final int ARM_REG_CPSR = 3;
	public static final int ARM_REG_FPEXC = 4;
	public static final int ARM_REG_FPINST = 5;
	public static final int ARM_REG_FPSCR = 6;
	public static final int ARM_REG_FPSCR_NZCV = 7;
	public static final int ARM_REG_FPSID = 8;
	public static final int ARM_REG_ITSTATE = 9;
	public static final int ARM_REG_LR = 10;
	public static final int ARM_REG_PC = 11;
	public static final int ARM_REG_SP = 12;
	public static final int ARM_REG_SPSR = 13;
	public static final int ARM_REG_D0 = 14;
	public static final int ARM_REG_D1 = 15;
	public static final int ARM_REG_D2 = 16;
	public static final int ARM_REG_D3 = 17;
	public static final int ARM_REG_D4 = 18;
	public static final int ARM_REG_D5 = 19;
	public static final int ARM_REG_D6 = 20;
	public static final int ARM_REG_D7 = 21;
	public static final int ARM_REG_D8 = 22;
	public static final int ARM_REG_D9 = 23;
	public static final int ARM_REG_D10 = 24;
	public static final int ARM_REG_D11 = 25;
	public static final int ARM_REG_D12 = 26;
	public static final int ARM_REG_D13 = 27;
	public static final int ARM_REG_D14 = 28;
	public static final int ARM_REG_D15 = 29;
	public static final int ARM_REG_D16 = 30;
	public static final int ARM_REG_D17 = 31;
	public static final int ARM_REG_D18 = 32;
	public static final int ARM_REG_D19 = 33;
	public static final int ARM_REG_D20 = 34;
	public static final int ARM_REG_D21 = 35;
	public static final int ARM_REG_D22 = 36;
	public static final int ARM_REG_D23 = 37;
	public static final int ARM_REG_D24 = 38;
	public static final int ARM_REG_D25 = 39;
	public static final int ARM_REG_D26 = 40;
	public static final int ARM_REG_D27 = 41;
	public static final int ARM_REG_D28 = 42;
	public static final int ARM_REG_D29 = 43;
	public static final int ARM_REG_D30 = 44;
	public static final int ARM_REG_D31 = 45;
	public static final int ARM_REG_FPINST2 = 46;
	public static final int ARM_REG_MVFR0 = 47;
	public static final int ARM_REG_MVFR1 = 48;
	public static final int ARM_REG_MVFR2 = 49;
	public static final int ARM_REG_Q0 = 50;
	public static final int ARM_REG_Q1 = 51;
	public static final int ARM_REG_Q2 = 52;
	public static final int ARM_REG_Q3 = 53;
	public static final int ARM_REG_Q4 = 54;
	public static final int ARM_REG_Q5 = 55;
	public static final int ARM_REG_Q6 = 56;
	public static final int ARM_REG_Q7 = 57;
	public static final int ARM_REG_Q8 = 58;
	public static final int ARM_REG_Q9 = 59;
	public static final int ARM_REG_Q10 = 60;
	public static final int ARM_REG_Q11 = 61;
	public static final int ARM_REG_Q12 = 62;
	public static final int ARM_REG_Q13 = 63;
	public static final int ARM_REG_Q14 = 64;
	public static final int ARM_REG_Q15 = 65;
	public static final int ARM_REG_R0 = 66;
	public static final int ARM_REG_R1 = 67;
	public static final int ARM_REG_R2 = 68;
	public static final int ARM_REG_R3 = 69;
	public static final int ARM_REG_R4 = 70;
	public static final int ARM_REG_R5 = 71;
	public static final int ARM_REG_R6 = 72;
	public static final int ARM_REG_R7 = 73;
	public static final int ARM_REG_R8 = 74;
	public static final int ARM_REG_R9 = 75;
	public static final int ARM_REG_R10 = 76;
	public static final int ARM_REG_R11 = 77;
	public static final int ARM_REG_R12 = 78;
	public static final int ARM_REG_S0 = 79;
	public static final int ARM_REG_S1 = 80;
	public static final int ARM_REG_S2 = 81;
	public static final int ARM_REG_S3 = 82;
	public static final int ARM_REG_S4 = 83;
	public static final int ARM_REG_S5 = 84;
	public static final int ARM_REG_S6 = 85;
	public static final int ARM_REG_S7 = 86;
	public static final int ARM_REG_S8 = 87;
	public static final int ARM_REG_S9 = 88;
	public static final int ARM_REG_S10 = 89;
	public static final int ARM_REG_S11 = 90;
	public static final int ARM_REG_S12 = 91;
	public static final int ARM_REG_S13 = 92;
	public static final int ARM_REG_S14 = 93;
	public static final int ARM_REG_S15 = 94;
	public static final int ARM_REG_S16 = 95;
	public static final int ARM_REG_S17 = 96;
	public static final int ARM_REG_S18 = 97;
	public static final int ARM_REG_S19 = 98;
	public static final int ARM_REG_S20 = 99;
	public static final int ARM_REG_S21 = 100;
	public static final int ARM_REG_S22 = 101;
	public static final int ARM_REG_S23 = 102;
	public static final int ARM_REG_S24 = 103;
	public static final int ARM_REG_S25 = 104;
	public static final int ARM_REG_S26 = 105;
	public static final int ARM_REG_S27 = 106;
	public static final int ARM_REG_S28 = 107;
	public static final int ARM_REG_S29 = 108;
	public static final int ARM_REG_S30 = 109;
	public static final int ARM_REG_S31 = 110;
	public static final int ARM_REG_ENDING = 111;
	public static final int ARM_REG_R13 = ARM_REG_SP;
	public static final int ARM_REG_R14 = ARM_REG_LR;
	public static final int ARM_REG_R15 = ARM_REG_PC;
	public static final int ARM_REG_SB = ARM_REG_R9;
	public static final int ARM_REG_SL = ARM_REG_R10;
	public static final int ARM_REG_FP = ARM_REG_R11;
	public static final int ARM_REG_IP = ARM_REG_R12;

	public static final int ARM_INS_INVALID = 0;
	public static final int ARM_INS_ADC = 1;
	public static final int ARM_INS_ADD = 2;
	public static final int ARM_INS_ADDW = 3;
	public static final int ARM_INS_ADR = 4;
	public static final int ARM_INS_AESD = 5;
	public static final int ARM_INS_AESE = 6;
	public static final int ARM_INS_AESIMC = 7;
	public static final int ARM_INS_AESMC = 8;
	public static final int ARM_INS_AND = 9;
	public static final int ARM_INS_ASR = 10;
	public static final int ARM_INS_B = 11;
	public static final int ARM_INS_BFC = 12;
	public static final int ARM_INS_BFI = 13;
	public static final int ARM_INS_BIC = 14;
	public static final int ARM_INS_BKPT = 15;
	public static final int ARM_INS_BL = 16;
	public static final int ARM_INS_BLX = 17;
	public static final int ARM_INS_BLXNS = 18;
	public static final int ARM_INS_BX = 19;
	public static final int ARM_INS_BXJ = 20;
	public static final int ARM_INS_BXNS = 21;
	public static final int ARM_INS_CBNZ = 22;
	public static final int ARM_INS_CBZ = 23;
	public static final int ARM_INS_CDP = 24;
	public static final int ARM_INS_CDP2 = 25;
	public static final int ARM_INS_CLREX = 26;
	public static final int ARM_INS_CLZ = 27;
	public static final int ARM_INS_CMN = 28;
	public static final int ARM_INS_CMP = 29;
	public static final int ARM_INS_CPS = 30;
	public static final int ARM_INS_CRC32B = 31;
	public static final int ARM_INS_CRC32CB = 32;
	public static final int ARM_INS_CRC32CH = 33;
	public static final int ARM_INS_CRC32CW = 34;
	public static final int ARM_INS_CRC32H = 35;
	public static final int ARM_INS_CRC32W = 36;
	public static final int ARM_INS_CSDB = 37;
	public static final int ARM_INS_DBG = 38;
	public static final int ARM_INS_DCPS1 = 39;
	public static final int ARM_INS_DCPS2 = 40;
	public static final int ARM_INS_DCPS3 = 41;
	public static final int ARM_INS_DFB = 42;
	public static final int ARM_INS_DMB = 43;
	public static final int ARM_INS_DSB = 44;
	public static final int ARM_INS_EOR = 45;
	public static final int ARM_INS_ERET = 46;
	public static final int ARM_INS_ESB = 47;
	public static final int ARM_INS_FADDD = 48;
	public static final int ARM_INS_FADDS = 49;
	public static final int ARM_INS_FCMPZD = 50;
	public static final int ARM_INS_FCMPZS = 51;
	public static final int ARM_INS_FCONSTD = 52;
	public static final int ARM_INS_FCONSTS = 53;
	public static final int ARM_INS_FLDMDBX = 54;
	public static final int ARM_INS_FLDMIAX = 55;
	public static final int ARM_INS_FMDHR = 56;
	public static final int ARM_INS_FMDLR = 57;
	public static final int ARM_INS_FMSTAT = 58;
	public static final int ARM_INS_FSTMDBX = 59;
	public static final int ARM_INS_FSTMIAX = 60;
	public static final int ARM_INS_FSUBD = 61;
	public static final int ARM_INS_FSUBS = 62;
	public static final int ARM_INS_HINT = 63;
	public static final int ARM_INS_HLT = 64;
	public static final int ARM_INS_HVC = 65;
	public static final int ARM_INS_ISB = 66;
	public static final int ARM_INS_IT = 67;
	public static final int ARM_INS_LDA = 68;
	public static final int ARM_INS_LDAB = 69;
	public static final int ARM_INS_LDAEX = 70;
	public static final int ARM_INS_LDAEXB = 71;
	public static final int ARM_INS_LDAEXD = 72;
	public static final int ARM_INS_LDAEXH = 73;
	public static final int ARM_INS_LDAH = 74;
	public static final int ARM_INS_LDC = 75;
	public static final int ARM_INS_LDC2 = 76;
	public static final int ARM_INS_LDC2L = 77;
	public static final int ARM_INS_LDCL = 78;
	public static final int ARM_INS_LDM = 79;
	public static final int ARM_INS_LDMDA = 80;
	public static final int ARM_INS_LDMDB = 81;
	public static final int ARM_INS_LDMIB = 82;
	public static final int ARM_INS_LDR = 83;
	public static final int ARM_INS_LDRB = 84;
	public static final int ARM_INS_LDRBT = 85;
	public static final int ARM_INS_LDRD = 86;
	public static final int ARM_INS_LDREX = 87;
	public static final int ARM_INS_LDREXB = 88;
	public static final int ARM_INS_LDREXD = 89;
	public static final int ARM_INS_LDREXH = 90;
	public static final int ARM_INS_LDRH = 91;
	public static final int ARM_INS_LDRHT = 92;
	public static final int ARM_INS_LDRSB = 93;
	public static final int ARM_INS_LDRSBT = 94;
	public static final int ARM_INS_LDRSH = 95;
	public static final int ARM_INS_LDRSHT = 96;
	public static final int ARM_INS_LDRT = 97;
	public static final int ARM_INS_LSL = 98;
	public static final int ARM_INS_LSR = 99;
	public static final int ARM_INS_MCR = 100;
	public static final int ARM_INS_MCR2 = 101;
	public static final int ARM_INS_MCRR = 102;
	public static final int ARM_INS_MCRR2 = 103;
	public static final int ARM_INS_MLA = 104;
	public static final int ARM_INS_MLS = 105;
	public static final int ARM_INS_MOV = 106;
	public static final int ARM_INS_MOVS = 107;
	public static final int ARM_INS_MOVT = 108;
	public static final int ARM_INS_MOVW = 109;
	public static final int ARM_INS_MRC = 110;
	public static final int ARM_INS_MRC2 = 111;
	public static final int ARM_INS_MRRC = 112;
	public static final int ARM_INS_MRRC2 = 113;
	public static final int ARM_INS_MRS = 114;
	public static final int ARM_INS_MSR = 115;
	public static final int ARM_INS_MUL = 116;
	public static final int ARM_INS_MVN = 117;
	public static final int ARM_INS_NEG = 118;
	public static final int ARM_INS_NOP = 119;
	public static final int ARM_INS_ORN = 120;
	public static final int ARM_INS_ORR = 121;
	public static final int ARM_INS_PKHBT = 122;
	public static final int ARM_INS_PKHTB = 123;
	public static final int ARM_INS_PLD = 124;
	public static final int ARM_INS_PLDW = 125;
	public static final int ARM_INS_PLI = 126;
	public static final int ARM_INS_POP = 127;
	public static final int ARM_INS_PUSH = 128;
	public static final int ARM_INS_QADD = 129;
	public static final int ARM_INS_QADD16 = 130;
	public static final int ARM_INS_QADD8 = 131;
	public static final int ARM_INS_QASX = 132;
	public static final int ARM_INS_QDADD = 133;
	public static final int ARM_INS_QDSUB = 134;
	public static final int ARM_INS_QSAX = 135;
	public static final int ARM_INS_QSUB = 136;
	public static final int ARM_INS_QSUB16 = 137;
	public static final int ARM_INS_QSUB8 = 138;
	public static final int ARM_INS_RBIT = 139;
	public static final int ARM_INS_REV = 140;
	public static final int ARM_INS_REV16 = 141;
	public static final int ARM_INS_REVSH = 142;
	public static final int ARM_INS_RFEDA = 143;
	public static final int ARM_INS_RFEDB = 144;
	public static final int ARM_INS_RFEIA = 145;
	public static final int ARM_INS_RFEIB = 146;
	public static final int ARM_INS_ROR = 147;
	public static final int ARM_INS_RRX = 148;
	public static final int ARM_INS_RSB = 149;
	public static final int ARM_INS_RSC = 150;
	public static final int ARM_INS_SADD16 = 151;
	public static final int ARM_INS_SADD8 = 152;
	public static final int ARM_INS_SASX = 153;
	public static final int ARM_INS_SBC = 154;
	public static final int ARM_INS_SBFX = 155;
	public static final int ARM_INS_SDIV = 156;
	public static final int ARM_INS_SEL = 157;
	public static final int ARM_INS_SETEND = 158;
	public static final int ARM_INS_SETPAN = 159;
	public static final int ARM_INS_SEV = 160;
	public static final int ARM_INS_SEVL = 161;
	public static final int ARM_INS_SG = 162;
	public static final int ARM_INS_SHA1C = 163;
	public static final int ARM_INS_SHA1H = 164;
	public static final int ARM_INS_SHA1M = 165;
	public static final int ARM_INS_SHA1P = 166;
	public static final int ARM_INS_SHA1SU0 = 167;
	public static final int ARM_INS_SHA1SU1 = 168;
	public static final int ARM_INS_SHA256H = 169;
	public static final int ARM_INS_SHA256H2 = 170;
	public static final int ARM_INS_SHA256SU0 = 171;
	public static final int ARM_INS_SHA256SU1 = 172;
	public static final int ARM_INS_SHADD16 = 173;
	public static final int ARM_INS_SHADD8 = 174;
	public static final int ARM_INS_SHASX = 175;
	public static final int ARM_INS_SHSAX = 176;
	public static final int ARM_INS_SHSUB16 = 177;
	public static final int ARM_INS_SHSUB8 = 178;
	public static final int ARM_INS_SMC = 179;
	public static final int ARM_INS_SMLABB = 180;
	public static final int ARM_INS_SMLABT = 181;
	public static final int ARM_INS_SMLAD = 182;
	public static final int ARM_INS_SMLADX = 183;
	public static final int ARM_INS_SMLAL = 184;
	public static final int ARM_INS_SMLALBB = 185;
	public static final int ARM_INS_SMLALBT = 186;
	public static final int ARM_INS_SMLALD = 187;
	public static final int ARM_INS_SMLALDX = 188;
	public static final int ARM_INS_SMLALTB = 189;
	public static final int ARM_INS_SMLALTT = 190;
	public static final int ARM_INS_SMLATB = 191;
	public static final int ARM_INS_SMLATT = 192;
	public static final int ARM_INS_SMLAWB = 193;
	public static final int ARM_INS_SMLAWT = 194;
	public static final int ARM_INS_SMLSD = 195;
	public static final int ARM_INS_SMLSDX = 196;
	public static final int ARM_INS_SMLSLD = 197;
	public static final int ARM_INS_SMLSLDX = 198;
	public static final int ARM_INS_SMMLA = 199;
	public static final int ARM_INS_SMMLAR = 200;
	public static final int ARM_INS_SMMLS = 201;
	public static final int ARM_INS_SMMLSR = 202;
	public static final int ARM_INS_SMMUL = 203;
	public static final int ARM_INS_SMMULR = 204;
	public static final int ARM_INS_SMUAD = 205;
	public static final int ARM_INS_SMUADX = 206;
	public static final int ARM_INS_SMULBB = 207;
	public static final int ARM_INS_SMULBT = 208;
	public static final int ARM_INS_SMULL = 209;
	public static final int ARM_INS_SMULTB = 210;
	public static final int ARM_INS_SMULTT = 211;
	public static final int ARM_INS_SMULWB = 212;
	public static final int ARM_INS_SMULWT = 213;
	public static final int ARM_INS_SMUSD = 214;
	public static final int ARM_INS_SMUSDX = 215;
	public static final int ARM_INS_SRSDA = 216;
	public static final int ARM_INS_SRSDB = 217;
	public static final int ARM_INS_SRSIA = 218;
	public static final int ARM_INS_SRSIB = 219;
	public static final int ARM_INS_SSAT = 220;
	public static final int ARM_INS_SSAT16 = 221;
	public static final int ARM_INS_SSAX = 222;
	public static final int ARM_INS_SSUB16 = 223;
	public static final int ARM_INS_SSUB8 = 224;
	public static final int ARM_INS_STC = 225;
	public static final int ARM_INS_STC2 = 226;
	public static final int ARM_INS_STC2L = 227;
	public static final int ARM_INS_STCL = 228;
	public static final int ARM_INS_STL = 229;
	public static final int ARM_INS_STLB = 230;
	public static final int ARM_INS_STLEX = 231;
	public static final int ARM_INS_STLEXB = 232;
	public static final int ARM_INS_STLEXD = 233;
	public static final int ARM_INS_STLEXH = 234;
	public static final int ARM_INS_STLH = 235;
	public static final int ARM_INS_STM = 236;
	public static final int ARM_INS_STMDA = 237;
	public static final int ARM_INS_STMDB = 238;
	public static final int ARM_INS_STMIB = 239;
	public static final int ARM_INS_STR = 240;
	public static final int ARM_INS_STRB = 241;
	public static final int ARM_INS_STRBT = 242;
	public static final int ARM_INS_STRD = 243;
	public static final int ARM_INS_STREX = 244;
	public static final int ARM_INS_STREXB = 245;
	public static final int ARM_INS_STREXD = 246;
	public static final int ARM_INS_STREXH = 247;
	public static final int ARM_INS_STRH = 248;
	public static final int ARM_INS_STRHT = 249;
	public static final int ARM_INS_STRT = 250;
	public static final int ARM_INS_SUB = 251;
	public static final int ARM_INS_SUBS = 252;
	public static final int ARM_INS_SUBW = 253;
	public static final int ARM_INS_SVC = 254;
	public static final int ARM_INS_SWP = 255;
	public static final int ARM_INS_SWPB = 256;
	public static final int ARM_INS_SXTAB = 257;
	public static final int ARM_INS_SXTAB16 = 258;
	public static final int ARM_INS_SXTAH = 259;
	public static final int ARM_INS_SXTB = 260;
	public static final int ARM_INS_SXTB16 = 261;
	public static final int ARM_INS_SXTH = 262;
	public static final int ARM_INS_TBB = 263;
	public static final int ARM_INS_TBH = 264;
	public static final int ARM_INS_TEQ = 265;
	public static final int ARM_INS_TRAP = 266;
	public static final int ARM_INS_TSB = 267;
	public static final int ARM_INS_TST = 268;
	public static final int ARM_INS_TT = 269;
	public static final int ARM_INS_TTA = 270;
	public static final int ARM_INS_TTAT = 271;
	public static final int ARM_INS_TTT = 272;
	public static final int ARM_INS_UADD16 = 273;
	public static final int ARM_INS_UADD8 = 274;
	public static final int ARM_INS_UASX = 275;
	public static final int ARM_INS_UBFX = 276;
	public static final int ARM_INS_UDF = 277;
	public static final int ARM_INS_UDIV = 278;
	public static final int ARM_INS_UHADD16 = 279;
	public static final int ARM_INS_UHADD8 = 280;
	public static final int ARM_INS_UHASX = 281;
	public static final int ARM_INS_UHSAX = 282;
	public static final int ARM_INS_UHSUB16 = 283;
	public static final int ARM_INS_UHSUB8 = 284;
	public static final int ARM_INS_UMAAL = 285;
	public static final int ARM_INS_UMLAL = 286;
	public static final int ARM_INS_UMULL = 287;
	public static final int ARM_INS_UQADD16 = 288;
	public static final int ARM_INS_UQADD8 = 289;
	public static final int ARM_INS_UQASX = 290;
	public static final int ARM_INS_UQSAX = 291;
	public static final int ARM_INS_UQSUB16 = 292;
	public static final int ARM_INS_UQSUB8 = 293;
	public static final int ARM_INS_USAD8 = 294;
	public static final int ARM_INS_USADA8 = 295;
	public static final int ARM_INS_USAT = 296;
	public static final int ARM_INS_USAT16 = 297;
	public static final int ARM_INS_USAX = 298;
	public static final int ARM_INS_USUB16 = 299;
	public static final int ARM_INS_USUB8 = 300;
	public static final int ARM_INS_UXTAB = 301;
	public static final int ARM_INS_UXTAB16 = 302;
	public static final int ARM_INS_UXTAH = 303;
	public static final int ARM_INS_UXTB = 304;
	public static final int ARM_INS_UXTB16 = 305;
	public static final int ARM_INS_UXTH = 306;
	public static final int ARM_INS_VABA = 307;
	public static final int ARM_INS_VABAL = 308;
	public static final int ARM_INS_VABD = 309;
	public static final int ARM_INS_VABDL = 310;
	public static final int ARM_INS_VABS = 311;
	public static final int ARM_INS_VACGE = 312;
	public static final int ARM_INS_VACGT = 313;
	public static final int ARM_INS_VACLE = 314;
	public static final int ARM_INS_VACLT = 315;
	public static final int ARM_INS_VADD = 316;
	public static final int ARM_INS_VADDHN = 317;
	public static final int ARM_INS_VADDL = 318;
	public static final int ARM_INS_VADDW = 319;
	public static final int ARM_INS_VAND = 320;
	public static final int ARM_INS_VBIC = 321;
	public static final int ARM_INS_VBIF = 322;
	public static final int ARM_INS_VBIT = 323;
	public static final int ARM_INS_VBSL = 324;
	public static final int ARM_INS_VCADD = 325;
	public static final int ARM_INS_VCEQ = 326;
	public static final int ARM_INS_VCGE = 327;
	public static final int ARM_INS_VCGT = 328;
	public static final int ARM_INS_VCLE = 329;
	public static final int ARM_INS_VCLS = 330;
	public static final int ARM_INS_VCLT = 331;
	public static final int ARM_INS_VCLZ = 332;
	public static final int ARM_INS_VCMLA = 333;
	public static final int ARM_INS_VCMP = 334;
	public static final int ARM_INS_VCMPE = 335;
	public static final int ARM_INS_VCNT = 336;
	public static final int ARM_INS_VCVT = 337;
	public static final int ARM_INS_VCVTA = 338;
	public static final int ARM_INS_VCVTB = 339;
	public static final int ARM_INS_VCVTM = 340;
	public static final int ARM_INS_VCVTN = 341;
	public static final int ARM_INS_VCVTP = 342;
	public static final int ARM_INS_VCVTR = 343;
	public static final int ARM_INS_VCVTT = 344;
	public static final int ARM_INS_VDIV = 345;
	public static final int ARM_INS_VDUP = 346;
	public static final int ARM_INS_VEOR = 347;
	public static final int ARM_INS_VEXT = 348;
	public static final int ARM_INS_VFMA = 349;
	public static final int ARM_INS_VFMS = 350;
	public static final int ARM_INS_VFNMA = 351;
	public static final int ARM_INS_VFNMS = 352;
	public static final int ARM_INS_VHADD = 353;
	public static final int ARM_INS_VHSUB = 354;
	public static final int ARM_INS_VINS = 355;
	public static final int ARM_INS_VJCVT = 356;
	public static final int ARM_INS_VLD1 = 357;
	public static final int ARM_INS_VLD2 = 358;
	public static final int ARM_INS_VLD3 = 359;
	public static final int ARM_INS_VLD4 = 360;
	public static final int ARM_INS_VLDMDB = 361;
	public static final int ARM_INS_VLDMIA = 362;
	public static final int ARM_INS_VLDR = 363;
	public static final int ARM_INS_VLLDM = 364;
	public static final int ARM_INS_VLSTM = 365;
	public static final int ARM_INS_VMAX = 366;
	public static final int ARM_INS_VMAXNM = 367;
	public static final int ARM_INS_VMIN = 368;
	public static final int ARM_INS_VMINNM = 369;
	public static final int ARM_INS_VMLA = 370;
	public static final int ARM_INS_VMLAL = 371;
	public static final int ARM_INS_VMLS = 372;
	public static final int ARM_INS_VMLSL = 373;
	public static final int ARM_INS_VMOV = 374;
	public static final int ARM_INS_VMOVL = 375;
	public static final int ARM_INS_VMOVN = 376;
	public static final int ARM_INS_VMOVX = 377;
	public static final int ARM_INS_VMRS = 378;
	public static final int ARM_INS_VMSR = 379;
	public static final int ARM_INS_VMUL = 380;
	public static final int ARM_INS_VMULL = 381;
	public static final int ARM_INS_VMVN = 382;
	public static final int ARM_INS_VNEG = 383;
	public static final int ARM_INS_VNMLA = 384;
	public static final int ARM_INS_VNMLS = 385;
	public static final int ARM_INS_VNMUL = 386;
	public static final int ARM_INS_VORN = 387;
	public static final int ARM_INS_VORR = 388;
	public static final int ARM_INS_VPADAL = 389;
	public static final int ARM_INS_VPADD = 390;
	public static final int ARM_INS_VPADDL = 391;
	public static final int ARM_INS_VPMAX = 392;
	public static final int ARM_INS_VPMIN = 393;
	public static final int ARM_INS_VPOP = 394;
	public static final int ARM_INS_VPUSH = 395;
	public static final int ARM_INS_VQABS = 396;
	public static final int ARM_INS_VQADD = 397;
	public static final int ARM_INS_VQDMLAL = 398;
	public static final int ARM_INS_VQDMLSL = 399;
	public static final int ARM_INS_VQDMULH = 400;
	public static final int ARM_INS_VQDMULL = 401;
	public static final int ARM_INS_VQMOVN = 402;
	public static final int ARM_INS_VQMOVUN = 403;
	public static final int ARM_INS_VQNEG = 404;
	public static final int ARM_INS_VQRDMLAH = 405;
	public static final int ARM_INS_VQRDMLSH = 406;
	public static final int ARM_INS_VQRDMULH = 407;
	public static final int ARM_INS_VQRSHL = 408;
	public static final int ARM_INS_VQRSHRN = 409;
	public static final int ARM_INS_VQRSHRUN = 410;
	public static final int ARM_INS_VQSHL = 411;
	public static final int ARM_INS_VQSHLU = 412;
	public static final int ARM_INS_VQSHRN = 413;
	public static final int ARM_INS_VQSHRUN = 414;
	public static final int ARM_INS_VQSUB = 415;
	public static final int ARM_INS_VRADDHN = 416;
	public static final int ARM_INS_VRECPE = 417;
	public static final int ARM_INS_VRECPS = 418;
	public static final int ARM_INS_VREV16 = 419;
	public static final int ARM_INS_VREV32 = 420;
	public static final int ARM_INS_VREV64 = 421;
	public static final int ARM_INS_VRHADD = 422;
	public static final int ARM_INS_VRINTA = 423;
	public static final int ARM_INS_VRINTM = 424;
	public static final int ARM_INS_VRINTN = 425;
	public static final int ARM_INS_VRINTP = 426;
	public static final int ARM_INS_VRINTR = 427;
	public static final int ARM_INS_VRINTX = 428;
	public static final int ARM_INS_VRINTZ = 429;
	public static final int ARM_INS_VRSHL = 430;
	public static final int ARM_INS_VRSHR = 431;
	public static final int ARM_INS_VRSHRN = 432;
	public static final int ARM_INS_VRSQRTE = 433;
	public static final int ARM_INS_VRSQRTS = 434;
	public static final int ARM_INS_VRSRA = 435;
	public static final int ARM_INS_VRSUBHN = 436;
	public static final int ARM_INS_VSDOT = 437;
	public static final int ARM_INS_VSELEQ = 438;
	public static final int ARM_INS_VSELGE = 439;
	public static final int ARM_INS_VSELGT = 440;
	public static final int ARM_INS_VSELVS = 441;
	public static final int ARM_INS_VSHL = 442;
	public static final int ARM_INS_VSHLL = 443;
	public static final int ARM_INS_VSHR = 444;
	public static final int ARM_INS_VSHRN = 445;
	public static final int ARM_INS_VSLI = 446;
	public static final int ARM_INS_VSQRT = 447;
	public static final int ARM_INS_VSRA = 448;
	public static final int ARM_INS_VSRI = 449;
	public static final int ARM_INS_VST1 = 450;
	public static final int ARM_INS_VST2 = 451;
	public static final int ARM_INS_VST3 = 452;
	public static final int ARM_INS_VST4 = 453;
	public static final int ARM_INS_VSTMDB = 454;
	public static final int ARM_INS_VSTMIA = 455;
	public static final int ARM_INS_VSTR = 456;
	public static final int ARM_INS_VSUB = 457;
	public static final int ARM_INS_VSUBHN = 458;
	public static final int ARM_INS_VSUBL = 459;
	public static final int ARM_INS_VSUBW = 460;
	public static final int ARM_INS_VSWP = 461;
	public static final int ARM_INS_VTBL = 462;
	public static final int ARM_INS_VTBX = 463;
	public static final int ARM_INS_VTRN = 464;
	public static final int ARM_INS_VTST = 465;
	public static final int ARM_INS_VUDOT = 466;
	public static final int ARM_INS_VUZP = 467;
	public static final int ARM_INS_VZIP = 468;
	public static final int ARM_INS_WFE = 469;
	public static final int ARM_INS_WFI = 470;
	public static final int ARM_INS_YIELD = 471;
	public static final int ARM_INS_ENDING = 472;

	public static final int ARM_GRP_INVALID = 0;
	public static final int ARM_GRP_JUMP = 1;
	public static final int ARM_GRP_CALL = 2;
	public static final int ARM_GRP_INT = 4;
	public static final int ARM_GRP_PRIVILEGE = 6;
	public static final int ARM_GRP_BRANCH_RELATIVE = 7;
	public static final int ARM_GRP_CRYPTO = 128;
	public static final int ARM_GRP_DATABARRIER = 129;
	public static final int ARM_GRP_DIVIDE = 130;
	public static final int ARM_GRP_FPARMV8 = 131;
	public static final int ARM_GRP_MULTPRO = 132;
	public static final int ARM_GRP_NEON = 133;
	public static final int ARM_GRP_T2EXTRACTPACK = 134;
	public static final int ARM_GRP_THUMB2DSP = 135;
	public static final int ARM_GRP_TRUSTZONE = 136;
	public static final int ARM_GRP_V4T = 137;
	public static final int ARM_GRP_V5T = 138;
	public static final int ARM_GRP_V5TE = 139;
	public static final int ARM_GRP_V6 = 140;
	public static final int ARM_GRP_V6T2 = 141;
	public static final int ARM_GRP_V7 = 142;
	public static final int ARM_GRP_V8 = 143;
	public static final int ARM_GRP_VFP2 = 144;
	public static final int ARM_GRP_VFP3 = 145;
	public static final int ARM_GRP_VFP4 = 146;
	public static final int ARM_GRP_ARM = 147;
	public static final int ARM_GRP_MCLASS = 148;
	public static final int ARM_GRP_NOTMCLASS = 149;
	public static final int ARM_GRP_THUMB = 150;
	public static final int ARM_GRP_THUMB1ONLY = 151;
	public static final int ARM_GRP_THUMB2 = 152;
	public static final int ARM_GRP_PREV8 = 153;
	public static final int ARM_GRP_FPVMLX = 154;
	public static final int ARM_GRP_MULOPS = 155;
	public static final int ARM_GRP_CRC = 156;
	public static final int ARM_GRP_DPVFP = 157;
	public static final int ARM_GRP_V6M = 158;
	public static final int ARM_GRP_VIRTUALIZATION = 159;
	public static final int ARM_GRP_ENDING = 160;
}